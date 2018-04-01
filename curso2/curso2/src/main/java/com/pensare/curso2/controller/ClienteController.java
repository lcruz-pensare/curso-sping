package com.pensare.curso2.controller;

import com.pensare.curso2.DAO.IClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Cliente")
public class ClienteController {
    @Autowired //Despues de este, se puede usar @Qualifier para indicar el bean a inyectar, en este caso no es necesario proque solo
    //hay una clase
    private IClienteDAO iClienteDAO;
    @GetMapping("/listar")
    public String listar(Model model){
        model.addAttribute("titulo","Listado de clientes");
        model.addAttribute("clientes",iClienteDAO.findAll());
        return "listar";
    }
}
