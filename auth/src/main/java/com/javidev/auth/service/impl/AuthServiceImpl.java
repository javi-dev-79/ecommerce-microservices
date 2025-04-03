package com.javidev.auth.service.impl;

import com.javidev.auth.dto.LoginResponseDTO;
import com.javidev.auth.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public LoginResponseDTO login(String email, String password) {

        if ("admin@correo.com".equals(email) && "1234".equals(password)) {
            return LoginResponseDTO.builder()
                    .token("fake-jwt-token")
                    .tokenType("Bearer")
                    .build();

        } else {
            throw new RuntimeException("Invalid credentials");
        }

    }
}
