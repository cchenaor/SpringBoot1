package com.example.change_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        String url = "jdbc:h2:mem:testdb";  // Reemplaza con tu URL
        String username = "usuario";  // Reemplaza con tu usuario
        String password = "contraseña";  // Reemplaza con tu contraseña

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            if (connection != null) {
                System.out.println("¡Conexión exitosa!");
            }
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
}