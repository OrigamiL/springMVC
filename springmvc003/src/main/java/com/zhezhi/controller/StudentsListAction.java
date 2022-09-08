package com.zhezhi.controller;

import com.zhezhi.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Program: springMVC
 * @ClassName: StudentsListAction
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-07 11:12
 **/

@Controller
public class StudentsListAction {
    @RequestMapping("/list.action")
    @ResponseBody//解析ajax请求
    public List<Student> list() {
        List<Student> list = new ArrayList<>();
        Student student = new Student("张三",12);
        Student student1 = new Student("李四",15);
        list.add(student);
        list.add(student1);
        return list;
    }
}
