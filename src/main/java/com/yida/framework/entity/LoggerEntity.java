/**
 * Copyright (C), 2015-2019
 * FileName: LoggerEntity
 * Project Name: springmvc-framework
 * Date:     2019/1/31 10:44
 * Description: 日志信息实体类
 */
package com.yida.framework.entity;

import lombok.*;

/**
 * 〈一句话功能简述〉
 * 〈日志信息实体类〉
 *
 * @author mashuai
 * @version 2019/1/31
 * @since JDK1.7
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LoggerEntity {

    /**
     * 类名
     */
    private String className;

    /**
     * 方法名
     */
    private String methodName;

    /**
     * 功能编码
     */
    private String functionCode;

    /**
     * 功能名称
     */
    private String functionName;

    /**
     * 错误编码
     */
    private String errorCode;

    /**
     * 错误描述
     */
    private String errorDesc;
}