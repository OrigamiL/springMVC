package com.zhezhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Program: springMVC
 * @ClassName: OtherAction
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-08 16:43
 **/

@Controller
public class OtherAction {
    @RequestMapping("/other.action")
    public String other(){
        return "main";
    }
}
