package com.guergen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class DefaultController {

    @GetMapping
    public String getIt() {

        return "home";
    }
}
