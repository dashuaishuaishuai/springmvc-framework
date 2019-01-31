/**   
 * @Title: OperDesc.java 
 * @Package: com.sitech.prm.iease.framework.base.annotation 
 * @CopyRright (c)2008-2020: si-tech 
 * @Project: 易企算 iease-base Maven Webapp
 * @Description: 操作描述的类
 * @author 人云 wanghwa@si-tech.com.cn
 * @date 2016-6-29 下午5:33:39 
 * @version V2.0   
 */
package com.yida.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Title: OperDesc
 * @Description: 操作描述及controller的异常信息
 * @author 人云 wanghwa@si-tech.com.cn
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OperDesc {

	String code();

	String name();
}
