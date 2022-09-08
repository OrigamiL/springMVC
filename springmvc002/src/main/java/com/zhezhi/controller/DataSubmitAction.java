package com.zhezhi.controller;

import com.zhezhi.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

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
     * 1.单个提交数据
     * 姓名：<input type="text" name="myName">
     * 年龄：<input type="text" name="age">
     * */
    @RequestMapping(value = "/one.action", method = RequestMethod.GET)
    public String one(String myName, int age) {
        System.out.println(myName + ":" + (age + 1));
        return "main";
    }

    /*
     * 2.对象封装提交数据
     * 在提交请求中，保证请求参数的名称与实体类中成员变量的名称一致，则可以自动创建对象，自动提交数据，自动类型转换
     * 自动封装数据到对象中
     * */
    @RequestMapping(value = "/two.action", method = RequestMethod.POST)
    public String two(User user) {
        System.out.println(user);
        return "main";
    }

    /*
     * 3.动态占位符提交
     * 仅限于超链接或地址栏提交数据，它是一杠一个值，一杠一个大括号，使用注解来解析
     * */
    @RequestMapping("/three/{name}/{age}.action")
    public String three(
            @PathVariable String name,
            @PathVariable int age) {
        System.out.println(name + ":" + age);
        return "main";
    }

    /*
     * 4.映射名称不一致
     * 提交请求参数与action方法的形参名称不一致，使用注解@RequestParam来解析
     * */
    @RequestMapping(value = "/four.action", method = RequestMethod.POST)
    public String four(
            @RequestParam("name")//专门用来解决名称不一致问题
            String uName,
            @RequestParam("age")
            int uAge) {
        System.out.println(uName+":"+uAge);
        return "main";
    }
    /*
    * 5.手工提取数据
    * */
    @RequestMapping(value = "/five.action",method = RequestMethod.POST)
    public String five(HttpServletRequest request) {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println(name+":"+age);
        return "main";
    }
}
