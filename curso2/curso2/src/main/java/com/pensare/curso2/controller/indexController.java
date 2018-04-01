package com.pensare.curso2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/curso")
public class indexController {
    @GetMapping("/index")
    public String holaindex(Model model){
        model.addAttribute("mensaje", "Hola que tal Spring Boot");
        return "hola";
    }
}
