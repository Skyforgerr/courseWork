package com.example.work.controllers;

import com.example.work.models.Disk;
import com.example.work.repositories.DiskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Ivan 12.12.2022
 */

@Controller
public class DiskController {
    @Autowired
    private DiskRepository diskRepository;

    @GetMapping("/disk")
    public String disk(Model model){
        Iterable<Disk> disks = diskRepository.findAll();
        model.addAttribute("disks", disks);
        return "disk";
    }
}
