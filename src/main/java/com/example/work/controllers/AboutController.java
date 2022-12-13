package com.example.work.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Ivan 12.12.2022
 */

@Controller
public class AboutController {
    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
