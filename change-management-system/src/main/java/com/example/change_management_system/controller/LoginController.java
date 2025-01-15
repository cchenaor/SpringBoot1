package com.example.change_management_system.controller;

import com.example.change_management_system.model.User;
import com.example.change_management_system.service.ChangeRequestService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class LoginController {
    @GetMapping("/login")
    public String loginPage() {
        return "Bienvenido a la página de inicio de sesión.";
    }
}
