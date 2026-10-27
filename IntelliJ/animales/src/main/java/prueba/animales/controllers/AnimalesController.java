package prueba.animales.controllers;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
    public String crearAnimal(@Valid @ModelAttribute("animal") Animales animales, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "animales/crear";
        } else {
            service.guardar(animales);
            return "redirect:/animales";
        }
    }

    @GetMapping("/editar/{id}")
    public String editarAnimal(@PathVariable int id, Model model){
        Animales animales = service.findById(id);
        model.addAttribute("animal", animales);
        return "animales/editar";
    }

    @PostMapping("/editar/{id}")
    public String editarAnimal(@PathVariable int id, @Valid @ModelAttribute("animal") Animales animales, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "animales/editar";
        }
        service.actualizar(id, animales);
        return "redirect:/animales";
    }
}