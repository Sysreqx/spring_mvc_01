package com.kaisar.spring_mvc.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showMyView(){
        return "myView";
    }

//    @RequestMapping("/askDetails")
//    public String askEmpDetails() {
//        return "askDetails";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "showDetails";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//
//        String empName = request.getParameter("empName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        return "showDetails";
//    }

    @RequestMapping("/askDetails")
    public String askEmpDetails(Model model) {

        model.addAttribute("employee", new Employee());

        return "askDetails";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {

        if (bindingResult.hasErrors())
            return "askDetails";
        else
            return "showDetails";

    }
}
