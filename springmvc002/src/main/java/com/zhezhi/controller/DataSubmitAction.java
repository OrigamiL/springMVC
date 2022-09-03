package com.zhezhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Program: springMVC
 * @ClassName: DataSubmitAction
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-03 16:44
 **/

@Controller
public class DataSubmitAction {
    /*
    * 姓名：<input type="text" name="myName">
    * 年龄：<input type="text" name="age">
    *
    * */
    @RequestMapping(value = "/one.action",method = RequestMethod.GET)
    public String one(String myName,int age) {
        System.out.println(myName+":"+(age+1));
        return "main";
    }
}
