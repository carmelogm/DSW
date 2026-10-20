package com.carmelo.Hola.Mundo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @GetMapping("/")
    public String menu(Model model){
        model.addAttribute("Menu", "Menu");
        return "menu";
    }

    @GetMapping("/index")
    public String saluda(Model model){
        model.addAttribute("Saludo", "Saludo");
        return "index";
    }

    @GetMapping("/despedida")
    public String despedir(Model model){
        model.addAttribute("Despedida", "Despedida");
        return "despedida";
    }

    @GetMapping("/felicita/{id}")
    public String felicitar(@PathVariable String id, Model model){
        model.addAttribute("Felicita", "Felicita");
        model.addAttribute("nombre", id);
        return "felicita";
    }
}