package com.fungigrotto;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontEnd {


    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "Hello, World!");
        return "hello";

    }







}
