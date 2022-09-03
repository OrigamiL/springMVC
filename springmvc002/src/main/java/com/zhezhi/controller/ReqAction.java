package com.zhezhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Program: springMVC
 * @ClassName: ReqAction
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-03 15:43
 **/

@Controller
public class ReqAction {
    @RequestMapping(value = "/req.action",method = RequestMethod.GET)
    public String req() {
        System.out.println("我是处理get请求的");
        return "main";
    }
    @RequestMapping(value = "/req.action",method = RequestMethod.POST)
    public String req1() {
        System.out.println("我是处理post请求的");
        return "main";
    }
}
