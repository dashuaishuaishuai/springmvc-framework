/**
 * Copyright (C), 2015-2019
 * FileName: ErrorCode
 * Project Name:springmvc-framework
 * Date:     2019/1/31 9:44
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
public interface ErrorCode {

    // 错误码编号
    String getCode();

    // 错误码描述
    String getDescription();

    /** 必须提供toString的实现
     *
     * <pre>
     * &#064;Override
     * public String toString() {
     * 	return String.format(&quot;Code:[%s], Description:[%s]. &quot;, this.code, this.describe);
     * }
     * </pre>
     *
     */
    String toString();
}