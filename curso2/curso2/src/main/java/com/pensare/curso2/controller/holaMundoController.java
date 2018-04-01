package com.pensare.curso2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prueba")
public class holaMundoController {
    @GetMapping("/holamundo")
    public String holamundo(){
        return "holamundo";
    }
}
