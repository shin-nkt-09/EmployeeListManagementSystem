package com.example.elms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    @GetMapping("/top")
    public String top(Model model) {
//        model.addAttribute("message", "Hello Thymeleaf !!");
        return "top";
    }

    @GetMapping("/insert")
    public String insert(Model model) {
        return "insert";
    }
}
