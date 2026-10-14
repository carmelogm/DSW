package com.carmelo.Hola.Mundo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String saluda(Model model){
        model.addAttribute("Saludo", "Hola");
        return "index";
    }

    @GetMapping("/despedida")
    public String despedir(Model model){
        model.addAttribute("Despedida", "Adiós");
        return "despedida";
    }
}