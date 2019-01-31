/**
 * Copyright (C), 2015-2019
 * FileName: CommonErrorCode
 * Project Name: springmvc-framework
 * Date:     2019/1/31 9:45
 * Description:
 */
package com.yida.framework.exception;

/**
 * 〈一句话功能简述〉
 * 〈〉
 *
 * @author mashuai
 * @version 2019/1/31
 * @since JDK1.7
 */
public class CommonErrorCode implements ErrorCode {

    private final String code;

    private final String describe;

    private CommonErrorCode(String code, String describe) {
        this.code = code;
        this.describe = describe;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getDescription() {
        return this.describe;
    }

    @Override
    public String toString() {
        return String.format("code:%s,describe:%s", this.code,
                this.describe);
    }
}