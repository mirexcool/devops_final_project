package com.application.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("title", "Main Page");
        return "home";
    }

    @GetMapping("/cv")
    public String aboutPage(Model model) {
        model.addAttribute("title", "Information about me");
        return "cv";
    }

}