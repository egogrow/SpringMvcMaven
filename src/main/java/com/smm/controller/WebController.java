package com.smm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/home")
    public String web(){
        System.out.println("@@메[시지 출력");
        return"index";
    }

}