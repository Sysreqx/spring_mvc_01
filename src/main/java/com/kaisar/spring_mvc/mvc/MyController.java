package com.kaisar.spring_mvc.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showMyView(){
        return "myView";
    }

    @RequestMapping("/askDetails")
    public String askEmpDetails() {
        return "askDetails";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails() {
        return "showDetails";
    }
}
