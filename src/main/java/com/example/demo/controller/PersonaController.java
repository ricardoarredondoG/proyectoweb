package com.example.demo.controller;

import com.example.demo.model.Persona;
import com.example.demo.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
public class PersonaController {

    @Autowired
    PersonaService service;

    @GetMapping
    public List<Persona>listar(){
        return service.listar();
    }

    @PostMapping
    public Persona agregar(@RequestBody Persona p){
        return service.add(p);
    }
}
