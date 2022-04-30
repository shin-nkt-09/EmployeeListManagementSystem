package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TopController {
    @GetMapping("/top")
    public String index(Model model) {
//        model.addAttribute("message", "Hello Thymeleaf !!");
        return "top";
    }
}