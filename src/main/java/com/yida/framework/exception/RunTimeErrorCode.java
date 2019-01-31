/**
 * Copyright (C), 2015-2019
 * FileName: RunTimeErrorCode
 * Project Name: springmvc-framework
 * Date:     2019/1/31 13:20
 * Description: 系统异常
 */
package com.yida.framework.exception;

/**
 * 〈一句话功能简述〉
 * 〈系统异常〉
 *
 * @author mashuai
 * @version 2019/1/31
 * @since JDK1.7
 */
public class RunTimeErrorCode implements ErrorCode {

    @Override
    public String getCode() {
        return "9999";
    }

    @Override
    public String getDescription() {
        return "系统异常";
    }

    @Override
    public String toString() {
        return String.format("code:%s,describe:%s", this.getCode(),
                this.getDescription());
    }
}