package com.example.work.controllers;

import com.example.work.models.Disk;
import com.example.work.repositories.DiskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/adddisk")
    public String add(Model model){
        return "adddisk";
    }
    @PostMapping("/adddisk")
    public String newDisk(@RequestParam String name, @RequestParam int cost, @RequestParam String year, @RequestParam String lable, @RequestParam String description){
        Disk disk = new Disk(name, cost, year, lable, description);
        diskRepository.save(disk);

        return "redirect:/article";
    }
}
