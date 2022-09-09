package com.zhezhi.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Program: springMVC
 * @ClassName: DateAction
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-09 11:28
 **/

/*
* 日期处理
* 1.日期的提交处理
* A.单个日期处理
* 使用@DateTimeFormat注解，此注解必须搭配springmvc.xml文件中的<mvc:annotation-driven/>标签
* B.类中全局日期处理
* 注册一个注解，用来解析本类中所有的日期类型，自动转换
*
* 2.日期的显示处理
* 在页面上显示好看的日期，必须使用JSTL。
* （1）添加依赖jstl   （2）在页面上导入标签库   （3）使用标签显示数据
* */
@Controller
public class DateAction {
    @RequestMapping(value = "/date.action",method = RequestMethod.POST)
    public String date(
            @DateTimeFormat(pattern = "yyyy-MM-dd")
            Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String s = simpleDateFormat.format(date);
        System.out.println(s);
        return "show";
    }
    //注册一个全局的日期处理注解
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        dataBinder.registerCustomEditor(Date.class,
                new CustomDateEditor(
                        new SimpleDateFormat("yyyy-MM-dd"),true));
    }
    @RequestMapping(value = "/date2.action",method = RequestMethod.POST)
    public String date2(Date date2, HttpServletRequest request) {
        System.out.println(date2);
        request.setAttribute("date2",new SimpleDateFormat("yyyy-MM-dd").format(date2));
        return "show";
    }
}
