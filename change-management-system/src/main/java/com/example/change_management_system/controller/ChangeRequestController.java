package com.example.change_management_system.controller;

import com.example.change_management_system.model.User;
import com.example.change_management_system.service.ChangeRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class ChangeRequestController {
    private final ChangeRequestService service;

    public ChangeRequestController(ChangeRequestService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }
    }
