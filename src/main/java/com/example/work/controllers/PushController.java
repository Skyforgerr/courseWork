package com.example.work.controllers;

import com.example.work.models.User;
import com.example.work.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Ivan 22.12.2022
 */

@Controller
public class PushController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public String user(){
        return "user";
    }
    @PostMapping("/user")
    public String newUser(@RequestParam String name, @RequestParam String surname, @RequestParam String number, @RequestParam String plate){
        User user = new User(name, surname, number, plate);
        userRepository.save(user);
        return "redirect:/main";
    }
}
