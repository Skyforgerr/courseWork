package com.example.work.controllers;

import com.example.work.models.Article;
import com.example.work.repositories.ArticleRepository;
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
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/article")
    public String article(Model model){
        Iterable<Article> articles = articleRepository.findAll();
        System.out.println(articles);
        model.addAttribute("articles", articles);
        return "article";
    }

    @GetMapping("/form")
    public String form(){
        return "form";
    }

    @PostMapping("/form")
    public String newArticle(@RequestParam String name, @RequestParam String description, @RequestParam String text){
        Article article = new Article(name, description, text);
        articleRepository.save(article);
        System.out.println("Saved a vinyl");
        return "redirect:/article";
    }
}
