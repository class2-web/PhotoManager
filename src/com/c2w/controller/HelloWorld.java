package com.c2w.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
    @RequestMapping("/HelloWorld")
    public String helloWorld(){
        return "hello";
    }
}
