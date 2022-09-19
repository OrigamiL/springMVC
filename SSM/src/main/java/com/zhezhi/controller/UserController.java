package com.zhezhi.controller;

import com.zhezhi.pojo.User;
import com.zhezhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @Program: springMVC
 * @ClassName: UserController
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-19 10:07
 **/

@RestController//如果本类中全部都是ajax请求，则使用此注解，方法上的@ResponseBody可不写
@RequestMapping("/user")
public class UserController {
    public static final int PAGE_SIZE = 5;

    @Autowired
    UserService userService;

    @RequestMapping("/selectUserPage")
    public List<User> selectUserPage(String userName, String userSex, Integer page) {//Integer可以为null
        //计算起始行
        int startRow = 0;
        if (page != null) {
            startRow = (page - 1) * PAGE_SIZE;
        }
        return userService.selectUserPage(userName, userSex, startRow);
    }

    @RequestMapping("/getRowCount")
    public int getRowCount(String userName, String userSex) {
        return userService.getRowCount(userName,userSex);
    }

    @RequestMapping("/deleteUserById")
    public int deleteUserById(String userId) {
        return userService.deleteUserById(userId);
    }

    @RequestMapping("/createUser")
    public int createUser(User user) {
        String userId = (System.currentTimeMillis()+String.valueOf(Math.random()*1000000)).substring(0,17);
        user.setUserId(userId);
        return userService.createUser(user);
    }
}
