/**
 * Copyright (C), 2015-2019
 * FileName: WebExceptionHandle
 * Project Name: springmvc-framework
 * Date:     2019/1/30 17:36
 * Description: 统一异常处理
 */
package com.yida.framework.exception;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;

/**
 * 〈一句话功能简述〉
 * 〈统一异常处理〉
 *
 * @author mashuai
 * @version 2019/1/30
 * @since JDK1.7
 */
@ControllerAdvice
@Slf4j
public class WebExceptionHandle {

    /**
     * 处理系统内部异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(CustomException.class)
    public Object CustomExceptionHandle(CustomException e) {
        return JSON.toJSON(e.getErrorCode().toString());
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Object RuntimeExceptionHandle(RuntimeException e) {
        e.printStackTrace();
        return JSON.toJSON(new RunTimeErrorCode().toString());
    }


}