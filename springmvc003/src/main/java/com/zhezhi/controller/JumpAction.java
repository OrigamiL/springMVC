package com.zhezhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Program: springMVC
 * @ClassName: JumpAction
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-08 16:15
 **/

@Controller
public class JumpAction {
    @RequestMapping("/one.action")
    public String one(){
        System.out.println("请求转发页面跳转");
        return "main";//默认是请求转发。使用视图解析器拼接前缀后缀进行页面跳转
    }
    @RequestMapping("/two.action")
    public String two(){
        System.out.println("请求转发action跳转");
        //forward: 这组字符串可以屏蔽前缀和后缀的拼接
        return "forward:/other.action";//默认是请求转发。使用视图解析器拼接前缀后缀进行页面跳转
    }
    @RequestMapping("/three.action")
    public String three(){
        System.out.println("重定向页面");
        return "redirect:/admin/main.jsp";
    }
    @RequestMapping("/four.action")
    public String four(){
        System.out.println("重定向action");
        return "redirect:other.action";
    }
}
