package com.pensareluis.Holamundo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pruebapractica")
public class Example4Controller {
    public static final String PAGINA_404 = "404";
    public static final String PAGINA_500 = "500";
    @GetMapping("/404")
    public ModelAndView pagina404(){
        return new ModelAndView((PAGINA_404));
    }

    @GetMapping("/500")
    public ModelAndView pagina500(){
        return new ModelAndView((PAGINA_500));
    }

}
