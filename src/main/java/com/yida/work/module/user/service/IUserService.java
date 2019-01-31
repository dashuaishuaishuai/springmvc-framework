/**
 * Copyright (C), 2015-2019
 * FileName: IUserService
 * Project Name:springmvc-framework
 * Date:     2019/1/30 17:00
 * Description:
 */
package com.yida.work.module.user.service;

import com.yida.work.entity.User;

/**
 * 〈一句话功能简述〉
 * 〈〉
 *
 * @author mashuai
 * @version 2019/1/30
 * @since JDK1.7
 */
public interface IUserService {


    User selectByPrimaryKey(String id);
}