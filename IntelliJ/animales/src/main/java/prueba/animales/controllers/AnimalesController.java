package prueba.animales.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import prueba.animales.models.Animales;
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
    @GetMapping("/animales/{id}")
    public String getAnimalesId(@PathVariable int id, Model model){
        Animales animal = service.findById(id);
        model.addAttribute("animal", animal);
        return "/detalles";
    }
}