package com.kaisar.spring_mvc.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showMyView(){
        return "myView";
    }
}
