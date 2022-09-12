package com.zhezhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Program: springMVC
 * @ClassName: WebInfAction
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-12 15:15
 **/

@Controller
public class WebInfAction {
    @RequestMapping("/showIndex.action")
    public String showIndex(){
        return "index";
    }
    @RequestMapping("/showMain.action")
    public String showMain(){
        return "main";
    }
    @RequestMapping("/showLogin.action")
    public String showLogin(){
        return "login";
    }
    /*
    * 登录判断
    * */
    @RequestMapping(value = "/login.action",method = RequestMethod.POST)
    public String login(String username, String password,
                        HttpServletRequest request, HttpServletResponse response){
        if ("admin".equals(username)&&"123".equals(password)){
            /*Cookie cookie1 = new Cookie("username","admin");
            cookie1.setPath("/");
            cookie1.setMaxAge(100*60);
            Cookie cookie2 = new Cookie("password","123");
            cookie2.setPath("/");
            cookie2.setMaxAge(100*60);
            response.addCookie(cookie1);
            response.addCookie(cookie2);*/
            request.getSession().setAttribute("username",username);
            request.getSession().setAttribute("password",password);
            return "index";
        }
        request.setAttribute("error","登录失败");
        return "login";
    }
}
