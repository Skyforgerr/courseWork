package com.example.work.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author Ivan 12.12.2022
 */

@Controller
public class MainController {

    @GetMapping("/main")
    public String main(Model model){
        return "main";
    }
}
