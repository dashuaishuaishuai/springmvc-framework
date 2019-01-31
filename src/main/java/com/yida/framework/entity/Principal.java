/**
 * Copyright (C), 2015-2019
 * FileName: Principal
 * Project Name: springmvc-framework
 * Date:     2019/1/31 14:51
 * Description:
 */
package com.yida.framework.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉
 * 〈〉
 *
 * @author mashuai
 * @version 2019/1/31
 * @since JDK1.7
 */
@Setter
@Getter
public class Principal implements Serializable {

    private static final long serialVersionUID = 190827256250144487L;

    private String account;

    private String password;
    private String phone;
    private String status;
}