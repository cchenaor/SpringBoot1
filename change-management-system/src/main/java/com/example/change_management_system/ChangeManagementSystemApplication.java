package com.example.change_management_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.change_management_system.Repository")
@EntityScan(basePackages = "com.example.change_management_system.model")
@SpringBootApplication
public class ChangeManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChangeManagementSystemApplication.class, args);
		System.out.println("Aplicación iniciada correctamente!");
	}

}
