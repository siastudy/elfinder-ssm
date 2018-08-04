package com.zzy.elfinder.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginAction {


    @RequestMapping("loginCheck")
    public String login(String username, String password){

        if (username == "test" && password == "test"){
            return "loginsuccess";
        } else {
            return "loginfail";
        }

    }
}
