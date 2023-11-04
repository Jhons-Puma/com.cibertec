package com.cibertec.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.model.Persona;
import com.cibertec.repository.PersonaRepository;

@Controller
@RequestMapping("/personas")
public class PersonaController {

    private final Logger logg = LoggerFactory.getLogger(Persona.class);

    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("personas", personaRepository.findAll());
        return "home";
    }

    @GetMapping("/crear")
    public String crear() {
        return "crear";
    }

    @PostMapping("/guardar")
    public String guardar(Persona persona) {
        logg.info("Información del objeto Persona, {}", persona);
        personaRepository.save(persona);
        return "redirect:/personas";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Persona p = personaRepository.getOne(id);
        logg.info("Objeto recuperado {}", p);
        model.addAttribute("persona", p);
        return "editar";
    }

    @GetMapping("/borrar/{id}")
    public String delete(@PathVariable Integer id) {
        Persona p = personaRepository.getOne(id);
        logg.info("Objeto eliminado {}", p);
        personaRepository.delete(p);
        return "redirect:/personas";
    }
}
