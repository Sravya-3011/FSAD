package com.klu.controller;

import com.klu.model.ModelMessage;
import com.klu.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/home")
    public String home(Model model) {

        ModelMessage msg = new ModelMessage(messageService.getMessage());

        model.addAttribute("message", msg);

        return "home"; // refers to home.html or home.jsp
    }
}