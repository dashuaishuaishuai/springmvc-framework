/**
 * Copyright (C), 2015-2019
 * FileName: UserServiceImpl
 * Project Name: springmvc-framework
 * Date:     2019/1/30 17:00
 * Description:
 */
package com.yida.work.module.user.service.impl;

import com.yida.work.dao.UserMapper;
import com.yida.work.entity.User;
import com.yida.work.module.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈一句话功能简述〉
 * 〈〉
 *
 * @author mashuai
 * @version 2019/1/30
 * @since JDK1.7
 */
@Service
@Transactional
public class UserServiceImpl implements IUserService{

    @Autowired
    UserMapper userMapper;


    @Override
    public User selectByPrimaryKey(String id) {
        return userMapper.selectByPrimaryKey(id);
    }
}