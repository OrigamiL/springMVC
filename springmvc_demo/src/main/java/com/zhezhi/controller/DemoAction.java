package com.zhezhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Program: springMVC
 * @ClassName: DemoAction
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-05 10:42
 **/

@Controller
public class DemoAction {
    @RequestMapping(value = "/demo.action",method = RequestMethod.GET)
    public String demo(String name) {
        return name;
    }
}
