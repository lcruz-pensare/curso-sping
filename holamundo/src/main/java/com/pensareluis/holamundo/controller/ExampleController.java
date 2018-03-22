package com.pensareluis.holamundo.controller;

import com.pensareluis.holamundo.controller.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/example")
public class ExampleController {
    public static final String EXAMPLE_VIEW= "example";
    //Primera forma
    @GetMapping("exampleString")
    public String exampleString(Model model)
    {
        model.addAttribute("people",getPeople());
        return EXAMPLE_VIEW;
    }
    //Segunda forma
     @GetMapping("exampleMAV")
    public ModelAndView exampleMAV(){
        ModelAndView mov= new ModelAndView(EXAMPLE_VIEW);
        mov.addObject("people",getPeople());
        return  mov;
    }

    private List<Person> getPeople(){
        List<Person> people = new ArrayList<>();
        people.add(new Person ("Jhon", 23));
        people.add(new Person ("Luis", 25));
        people.add(new Person ("Rafael", 30));
        people.add(new Person ("Naye", 27));
        return people;
    }
}
