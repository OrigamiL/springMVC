package com.zhezhi.controller;

import com.zhezhi.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.Map;

/**
 * @Program: springMVC
 * @ClassName: DataAction
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-09 10:28
 **/

/*
 * SpringMVC默认的参数类型  不需要去创建，直接拿来使用即可
 * 1.HttpServletRequest
 * 2.HttpServletResponse
 * 3.HttpSession
 * 4.Model
 * 5.Map
 * 6.ModelMap
 * 注意：Map。Model，ModelMap和request一样，都使用请求作用域进行数据传递，所以服务器端的跳转必须是请求转发。
 *      重定向也想携带数据只能用session
 * */
@Controller
public class DataAction {
    @RequestMapping("/data.action")
    public String data(HttpServletRequest request,
                       HttpServletResponse response,
                       HttpSession session,
                       ModelMap modelMap,
                       Model model,
                       Map map ){
        User user = new User("张三",14);
        request.setAttribute("requestUser",user);
        session.setAttribute("sessionUser",user);
        modelMap.addAttribute("modelMapUser",user);
        model.addAttribute("modelUser",user);
        map.put("mapUser",user);

        return "main";
    }
}
