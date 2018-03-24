package com.pensareluis.Holamundo.controller;

import com.pensareluis.Holamundo.controller.model.Person;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/example3")
public class Example3Controller {
    private static final Log LOGGER = LogFactory.getLog(Example3Controller.class);

    public static final String FORM_VIEW="form";
    public static final String RESULT_VIEW = "result";
    @GetMapping("/showform")
    public String showForm(Model model){
        LOGGER.info("INFO_TRACE");
        LOGGER.warn("WARNING_TRACE");
        LOGGER.error("ERROR_TRACE");
        LOGGER.debug("DEBUG_TRACE");
        model.addAttribute("person", new Person());
        return FORM_VIEW;
    }

    //Forma 1
    @GetMapping("/")
    public String redirect(){
        return "redirect:/example3/showform";
    }

    //Forma 2
    //@GetMapping("/")
    //public RedirectView(){
    //    return new RedirectView("/example3/showform");
    //}
    @PostMapping("/addperson")
    public ModelAndView addPerson(@Valid
                                      @ModelAttribute ("person") Person person, BindingResult bindingResult){
        ModelAndView mov = new ModelAndView();
        if(bindingResult.hasErrors())
        {
            mov.setViewName(FORM_VIEW);
        }
        else
        {
            mov.setViewName(RESULT_VIEW);
            mov.addObject("person",person);
        }



        return mov;
    }
}
