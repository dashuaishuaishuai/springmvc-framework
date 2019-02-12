package com.yida.framework.shiro;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

@Slf4j
public class MyFilter extends FormAuthenticationFilter {

    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) {
        return super.isAccessAllowed(servletRequest, servletResponse, o);
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
//        if (this.isLoginRequest(request, response)) {
//            if (this.isLoginSubmission(request, response)) {
//                return this.executeLogin(request, response);
//            } else {
//                return true;
//            }
//        } else {
//            if (isAjax(request)) {
//                response.setContentType("application/json;charset=UTF-8");
//                response.getWriter().print("你咩有登录,跳转到登录页面");
//            } else {
//                this.saveRequestAndRedirectToLogin(request, response);
//            }
//            return false;
//        }
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().print("{code:\"9999\",msg:\"请先登录\"}");
        return false;
    }

    public static boolean isAjax(ServletRequest request) {
        String header = ((HttpServletRequest) request).getHeader("X-Requested-With");
        if ("XMLHttpRequest".equalsIgnoreCase(header)) {
            System.out.println("当前请求为Ajax请求");
            return Boolean.TRUE;
        }
        System.out.println("当前请求非Ajax请求");
        return Boolean.FALSE;
    }


}
