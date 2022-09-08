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

/*
* action方法的返回值
* 1.String：客户端资源的地址，自动拼接前缀后缀，还可以屏蔽自动拼接字符串，可以指定返回的路径。
* 2.Object：返回json格式的对象，自动将对象或集合转化为json，使用的jackson工具进行转换，必须要添加jackson依赖，一般用于ajax请求
* 3.void：无返回值，一般用于ajax请求
* 4.基本数据类型：ajax请求
* 5.ModelAndView：返回数据和识图。
* */
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
