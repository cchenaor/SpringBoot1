package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HolaMundoController {
    @PostMapping("/login")
    public String holaMundo(String username, String password) {
        System.out.println("Usuario: " + username);
        System.out.println("Contraseña: " + password);

        // Redirige a otra página o devuelve una respuesta
        return "redirect:/success";
    }
}