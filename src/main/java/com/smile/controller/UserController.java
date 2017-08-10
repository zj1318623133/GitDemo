package com.smile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SmileZj on 2017/8/9.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("list.do")
    public String insert(){
        System.out.println("dsglkhgfsfgjhgdd");
        return "index";
    }
}
