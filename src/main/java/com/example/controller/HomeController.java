package com.example.controller;

import org.jasig.cas.client.authentication.AttributePrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
public class HomeController {
    @RequestMapping(value="/home")
    @ResponseBody
    public String home(HttpServletRequest request, Principal principal){
        String user = request.getRemoteUser();
        System.out.println(user);
        return "index";
    }
}
