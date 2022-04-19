package com.example.demo.services;

public interface JWTService {
    String generateToken();
    boolean validateToken(String token);
}
