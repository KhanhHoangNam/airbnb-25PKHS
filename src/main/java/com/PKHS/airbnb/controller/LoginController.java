package com.PKHS.airbnb.controller;

import com.PKHS.airbnb.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("home/login");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/check-login")
    public String checkLogin() {
        return "";
    }
}
