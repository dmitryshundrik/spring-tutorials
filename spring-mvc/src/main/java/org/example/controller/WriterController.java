package org.example.controller;

import org.example.service.WriterService;
import org.example.service.WriterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/writer")
public class WriterController {

    private final WriterService writerService;

    @Autowired
    public WriterController(WriterServiceImpl writerService) {
        this.writerService = writerService;
    }

    @GetMapping
    public String getWriter(Model model) {
        model.addAttribute("writer", writerService.getWriter());
        return "writer";
    }
}
