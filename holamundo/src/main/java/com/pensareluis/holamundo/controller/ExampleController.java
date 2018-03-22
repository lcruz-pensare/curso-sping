package com.pensareluis.holamundo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class ExampleController {
    public static final String EXAMPLE_VIEW= "example";
    //Primera forma
    @GetMapping("exampleString")
    public String exampleString()
    {
        return EXAMPLE_VIEW;
    }
    //Segunda forma
     @GetMapping("exampleMAV")
    public ModelAndView exampleMAV(){
        return new ModelAndView(EXAMPLE_VIEW);
    }
}