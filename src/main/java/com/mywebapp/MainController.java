package com.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController
{
    @GetMapping("/test")
    public String showHomePage()
    {
        System.out.println("Main Controller");
        return "index";
    }
}
