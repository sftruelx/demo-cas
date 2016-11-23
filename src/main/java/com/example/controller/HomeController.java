package com.example.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @RequestMapping(value="/home")
    @ResponseBody
    public String home(HttpServletRequest request){
//        String user = request.getRemoteUser();
//        System.out.println(user);
        return "index";
    }
}
