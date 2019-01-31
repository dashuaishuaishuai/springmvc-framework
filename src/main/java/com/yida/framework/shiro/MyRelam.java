/**
 * Copyright (C), 2015-2019
 * FileName: MyRelam
 * Project Name: springmvc-framework
 * Date:     2019/1/30 13:19
 * Description:
 */
package com.yida.framework.shiro;

import com.yida.framework.entity.Principal;
import com.yida.work.entity.User;
import com.yida.work.module.user.service.IUserService;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;

/**
 * 〈一句话功能简述〉
 * 〈〉
 *
 * @author mashuai
 * @version 2019/1/30
 * @since JDK1.7
 */
public class MyRelam extends AuthorizingRealm {


    @Resource
    IUserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken userToken = (UsernamePasswordToken) authenticationToken;//获取登录工号
        String account = userToken.getUsername();
        if (account == null) return null;
        User user = userService.selectByPrimaryKey(account);
        Principal principal = new Principal();
        try {
            BeanUtils.copyProperties(principal, user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (user != null) {
            return new SimpleAuthenticationInfo(principal, user.getPassword(), getName());

        }
        return null;
    }
}