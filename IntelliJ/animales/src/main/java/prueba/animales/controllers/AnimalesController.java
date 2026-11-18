
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
        return "index";
    }

    @GetMapping("/{id}")
    public String detalles(@PathVariable Integer id, Model model) {
        Animales animal = service.findById(id).orElse(null);
        model.addAttribute("animal", animal);
        return "detalles";
    }

    @GetMapping("/crear")
    public String crear(Model model) {
        model.addAttribute("animal", new Animales());
        return "crear";
    }

    @PostMapping("/crear")
    public String guardar(@Valid @ModelAttribute("animal") Animales animal,
                          BindingResult result) {
        if (result.hasErrors()) {
            return "crear";
        }

        service.guardar(animal);
        return "redirect:/animales";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Animales animal = service.findById(id).orElse(null);
        model.addAttribute("animal", animal);
        return "editar";
    }

    @PostMapping("/editar/{id}")
    public String actualizar(@PathVariable Integer id,
                             @Valid @ModelAttribute("animal") Animales animal,
                             BindingResult result) {
        if (result.hasErrors()) {
            return "editar";
        }

        service.actualizar(id, animal);
        return "redirect:/animales";
    }

    @PostMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        service.eliminarPorId(id);
        return "redirect:/animales";
    }
}
