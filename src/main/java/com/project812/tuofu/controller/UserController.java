package com.project812.tuofu.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @ResponseBody
    @PostMapping("/login")
    public String login(String loginname,String password,String code){
        System.out.println(loginname);
        System.out.println(password);
        System.out.println(code);
        return "success";
    }

}
