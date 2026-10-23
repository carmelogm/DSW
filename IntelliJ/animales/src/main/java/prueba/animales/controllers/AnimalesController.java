package prueba.animales.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
        return "/animales/index";
    }
    @GetMapping("/{id}")
    public String getAnimalesId(@PathVariable int id, Model model){
        Animales animal = service.findById(id);
        model.addAttribute("animal", animal);
        return "/animales/detalles";
    }

    @GetMapping("/crear")
    public String crearAnimal(Model model){
        model.addAttribute("animal", new Animales());
        return "animales/crear";
    }

    @PostMapping("/crear")
    public String crearAnimal(@ModelAttribute("animal") Animales animales){
        return "redirect:/";
    }
}