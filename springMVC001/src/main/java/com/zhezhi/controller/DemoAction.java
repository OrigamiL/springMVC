package com.zhezhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Program: springMVC
 * @ClassName: DemoAction
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-03 14:16
 **/

@Controller
@RequestMapping("/zar")
public class DemoAction {
    /*
    * action中所有的功能实现都是由方法来完成的
    * action方法的规范：
    * 1.访问权限是public
    * 2.方法的返回值任意
    * 3.方法名称任意
    * 4.方法可以没有参数，如果有参数，可以任意类型
    * 5.要使用@RequestMapping的注解来声明一个访问的路径（名称）
    * */
    @RequestMapping("/demo.action")
    /*
    * @RequestMapping注解详解：
    * 此注解就是来映射服务器访问的路径
    * 1.此注解可以加在方法上，是为此方法注册一个可以访问的路径（名称），如下
    * 2.此注解可以加在类上，相当于是包名（虚拟路径）,可以用来区分不同类中相同action的名称
    * 3.此注解可区分get请求和post请求
    * */
    public String demo() {
        System.out.println("服务器zar被访问到了！");
        return "main";//可以直接跳到/admin/main.jsp页面上
    }
}
