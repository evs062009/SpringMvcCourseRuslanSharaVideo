package com.controllers;

import com.domens.Group;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/input")
    public String input(@RequestParam String title) {
        return "input";
    }

    @RequestMapping("/greeting")
    public String processModel() {
        return "greeting";
    }

    @ModelAttribute
    private Group getGroup(HttpServletRequest request) {
        String name = request.getParameter("nameParam");
        return new Group(name);
    }
}
