package prueba.animales.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class AnimalesController {
    @GetMapping("/")
    public String menu (Model model){
        model.addAttribute("Menu", "Menu");
        return "menu";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("Listar", "Listar");
        return "/listar";
    }
}