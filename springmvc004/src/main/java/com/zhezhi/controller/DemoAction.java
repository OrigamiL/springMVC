package com.zhezhi.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Program: springMVC
 * @ClassName: DemoAction
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-12 14:32
 **/

@Controller
public class DemoAction {
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        dataBinder.registerCustomEditor(Date.class,
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
    }

}
