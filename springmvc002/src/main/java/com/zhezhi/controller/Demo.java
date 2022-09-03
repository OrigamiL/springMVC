package com.zhezhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Program: springMVC
 * @ClassName: demo
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-03 15:14
 **/

@Controller
public class Demo {

    @RequestMapping("/demo.action")
    public String demo (){
        return "main";
    }
}
