package prueba.animales.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import prueba.animales.services.AnimalesService;

@Controller

@RequestMapping("/animales")
public class AnimalesController {
    private final AnimalesService service;
    public AnimalesController(AnimalesService service) {
        this.service = service;
    }
    @GetMapping
    public String index(Model model) {
        model.addAttribute("animales", service.findAll());
        return "/index";
    }
}
