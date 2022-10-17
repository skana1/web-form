package com.estera.webform.controllers;

import com.estera.webform.models.Blog;
import com.estera.webform.repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogController {
    @Autowired
    BlogRepository blogRepository;

    @PostMapping("/blogs/store")
    public String store(Blog blog, Model model){
        blogRepository.save(blog);
        model.addAttribute("blog", blog);
        return "view";
    }
}
