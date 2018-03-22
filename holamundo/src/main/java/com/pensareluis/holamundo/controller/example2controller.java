package com.pensareluis.holamundo.controller;

import jdk.internal.dynalink.beans.StaticClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class example2controller {
    private static final String EXAMPLE2_VIEW = "example2";
    //localhost:808/example2/request1?nm=jon
    //localhost:808/example2/request1?nm=mikel
    @GetMapping("/requets1")
    public ModelAndView request1(@RequestParam(name="nm") String name){
        ModelAndView mov = new ModelAndView(EXAMPLE2_VIEW);
        mov.addObject("nm_in_model",name);
        return mov;
    }

    //localhost:8080/example2/request2/jon
    //localhost:8080/example2/request2/mikel
    @GetMapping("/request2/{nm}")
    public ModelAndView request2(@PathVariable("nm") String name){
        ModelAndView mov1 = new ModelAndView(EXAMPLE2_VIEW);
        mov1.addObject("nm_in_model",name);
        return mov1;

    }

}
