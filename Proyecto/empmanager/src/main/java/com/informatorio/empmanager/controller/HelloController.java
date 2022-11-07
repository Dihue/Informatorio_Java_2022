package com.informatorio.empmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Inyección de dependencia: indica a spring que es un controlador del tipo rest
@RestController
public class HelloController {
    // Cumple la misma función que view.py en python
    @GetMapping("/")
    public String hello() {
        // sale como texto plano en el navegador
        return "Hola Mundo";
    }
}
