package com.example.change_management_system.service;

import com.example.change_management_system.model.ChangeRequest;
import com.example.change_management_system.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChangeRequestService {

    private final UserRepository repository;

    @Autowired
    public ChangeRequestService(UserRepository repository) {
        this.repository = repository;
    }

    // Método para obtener todas las solicitudes de cambio
    public List<ChangeRequest> getAllChangeRequests() {
        return repository.findAll();
    }

    // Método para guardar una nueva solicitud de cambio
    public ChangeRequest saveChangeRequest(ChangeRequest changeRequest) {
        return repository.save(changeRequest);
    }

    // Otros métodos según sea necesario...
}