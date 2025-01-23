package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HolaMundoController {

    // Maneja solicitudes GET para mostrar la página de inicio de sesión
    @GetMapping("/login")
    public String mostrarLogin() {
        return "login.html"; // Nombre de la plantilla de inicio de sesión (por ejemplo, login.html)
    }
}