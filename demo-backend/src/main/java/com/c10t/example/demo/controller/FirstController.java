package com.c10t.example.demo.controller;

import com.c10t.example.demo.spec.Article;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping("/")
    public String index() {
        return "<h1>Foo</h2>";
    }

    @RequestMapping("/articles/{id}")
    public Article getArticleById(@PathVariable long id) {
        return Article.builder().id(id).title("Sample Title").build();
    }
}
