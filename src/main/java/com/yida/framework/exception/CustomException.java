/**
 * Copyright (C), 2015-2019
 * FileName: CustomException
 * Project Name: springmvc-framework
 * Date:     2019/1/31 9:35
 * Description: 自定义异常类
 */
package com.yida.framework.exception;

/**
 * 〈一句话功能简述〉
 * 〈自定义异常类〉
 * <p>
 * 业务异常类 出现业务异常时 throw new CustomExecption()
 *
 * @author mashuai
 * @version 2019/1/31
 * @since JDK1.7
 */

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CustomException  extends Exception implements Serializable{


    private static final long serialVersionUID = -3605210544427820788L;
    private ErrorCode errorCode;


    public CustomException(String message) {
        super(message);
    }

    public CustomException(ErrorCode errorCode, String errorMessage) {
        super(errorCode.toString() + " - " + errorMessage);
        this.errorCode = errorCode;
    }


    public static CustomException asCustomException(ErrorCode errorCode, String message) {
        return new CustomException(errorCode, message);
    }

}