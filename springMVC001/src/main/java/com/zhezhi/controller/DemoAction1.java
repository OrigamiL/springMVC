package com.zhezhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Program: springMVC
 * @ClassName: DemoAction1
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-03 14:16
 **/

@Controller
@RequestMapping("/user")
public class DemoAction1 {

    @RequestMapping("/demo.action")
    public String demo() {
        System.out.println("服务器user被访问到了！");
        return "main";
    }
}
