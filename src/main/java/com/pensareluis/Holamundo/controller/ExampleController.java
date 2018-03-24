package com.pensareluis.Holamundo.controller;

import com.pensareluis.Holamundo.component.ExampleComponent;
import com.pensareluis.Holamundo.controller.model.Person;
import com.pensareluis.Holamundo.services.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/example")
public class ExampleController {
    public static final String EXAMPLE_VIEW= "example";
    //Primera forma
    @Autowired
    @Qualifier("exampleComponent")
    private ExampleComponent exampleComponent;

    @Autowired
    @Qualifier("exampleService")
    private ExampleService exampleService;


    @GetMapping("exampleString")
    public String exampleString(Model model)
    {
        exampleComponent.sayHello();
        model.addAttribute("people",exampleService.getListPeople());
        return EXAMPLE_VIEW;
    }
    //Segunda forma
     @GetMapping("exampleMAV")
    public ModelAndView exampleMAV(){
        ModelAndView mov= new ModelAndView(EXAMPLE_VIEW);
        mov.addObject("people",exampleService.getListPeople());
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
