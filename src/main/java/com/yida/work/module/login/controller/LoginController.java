/**
 * Copyright (C), 2015-2019
 * FileName: LoginController
 * Project Name: springmvc-framework
 * Date:     2019/1/31 13:50
 * Description: 登录
 */
package com.yida.work.module.login.controller;

import com.yida.framework.utils.RSAUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉
 * 〈登录〉
 *
 * @author mashuai
 * @version 2019/1/31
 * @since JDK1.7
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    /**
     * 登录验证
     *
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Object doLogin(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        userName = RSAUtils.decryptStringByJs(userName);
        passWord = RSAUtils.decryptStringByJs(passWord);
        Subject subject = SecurityUtils.getSubject();
        Map<String, Object> result = new HashMap<String, Object>();
        UsernamePasswordToken token = new UsernamePasswordToken(userName, passWord);
        token.setRememberMe(true);
        try {
            subject.login(token);
            result.put("success", true);
            result.put("msg", "登陆成功");
        } catch (UnknownAccountException e) {
            e.printStackTrace();
            //未知账户信息
            result.put("errormsg", "未知账户信息");
        } catch (IncorrectCredentialsException e) {
            e.printStackTrace();
            //错误的用户信息
            result.put("errormsg", "错误的用户信息");
        } catch (LockedAccountException e) {
            e.printStackTrace();
            //用户被锁定
            result.put("errormsg", "用户被锁定");
        } catch (AuthenticationException e) {
            e.printStackTrace();
            //用户验证不通过
            result.put("errormsg", "用户验证不通过");
        } catch (Exception e) {
            e.printStackTrace();
            result.put("errormsg", "未知异常");
        }
        return result;
    }

    /**
     * 登出
     */
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public Object logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        Map<String, Integer> map = new HashMap();
        map.put("result", -1);
        return map;
    }
}