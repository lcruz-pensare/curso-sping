package com.pensareluis.holamundo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jorge Álvarez
 * @version 1.0 - 2018/03/21
 */
@Controller
@RequestMapping("/say")
public class HolaMundoController {
    @GetMapping("/helloworld")
    public String helloworld()
    {
        return "helloworld";
    }



}
