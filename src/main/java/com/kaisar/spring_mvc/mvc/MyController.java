package com.kaisar.spring_mvc.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

//    @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "showDetails";
//    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(HttpServletRequest request, Model model) {

        String empName = request.getParameter("empName");
        empName = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);

        return "showDetails";
    }
}
