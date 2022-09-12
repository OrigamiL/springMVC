package com.zhezhi.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Program: springMVC
 * @ClassName: LoginInterceptor
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-12 17:38
 **/

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("username")==null){
            request.setAttribute("error","对不起~您还没有登录");
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
            return false;
        }
        return true;
    }
}
