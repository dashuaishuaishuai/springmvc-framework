/**
 * Copyright (C), 2015-2019
 * FileName: UserController
 * Project Name: springmvc-framework
 * Date:     2019/1/30 14:41
 * Description: 用户管理
 */
package com.yida.work.module.user.controller;

import com.yida.framework.annotation.OperDesc;
import com.yida.framework.enums.OperDescType;
import com.yida.work.module.user.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈一句话功能简述〉
 * 〈用户管理〉
 *
 * @author mashuai
 * @version 2019/1/30
 * @since JDK1.7
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    IUserService userService;


    @GetMapping(value = "/list")
    @OperDesc(code = OperDescType.QUERY, name = "查询用户列表")
    public String userList(HttpServletRequest request, HttpServletResponse response) {
        log.info("");
        return "测试";
    }

    @GetMapping(value = "/{id}")
    @OperDesc(code = OperDescType.QUERY, name = "根据id查询用户信息")
    public Object getUserById(@PathVariable("id") String id) {
        return userService.selectByPrimaryKey(id);
    }

}