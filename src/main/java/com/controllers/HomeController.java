package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

//    @RequestMapping("/greeting")
//    public String showPage() {
//        return "greeting";
//    }

    @RequestMapping("/input")
    public String input() {
        return "input";
    }

    @RequestMapping("/greeting")
    public String processModel(HttpServletRequest request, Model model) {
        String name = request.getParameter("nameParam");
        name += ", the best group!";
        model.addAttribute("message", name);
        return "greeting";
    }
}
