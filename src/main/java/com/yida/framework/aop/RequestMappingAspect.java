/**
 * Copyright (C), 2015-2019
 * FileName: RequestMappingAspect
 * Project Name: springmvc-framework
 * Date:     2019/1/31 10:53
 * Description: 通过aop处理请求
 */
package com.yida.framework.aop;

import com.yida.framework.annotation.OperDesc;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉
 * 〈通过aop处理请求〉
 *
 * @author mashuai
 * @version 2019/1/31
 * @since JDK1.7
 */
@Aspect
@Component
public class RequestMappingAspect {

    @Pointcut("@annotation(com.yida.framework.annotation.OperDesc)")
    public void controllerAspect() {

    }

    @Around("controllerAspect()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        OperDesc operDesc = ((MethodSignature) pjp.getSignature()).getMethod().getAnnotation(OperDesc.class);
        /**
         * save log
         */
        /**
         * 封装返回参数
         */
        return pjp.proceed();
    }
}