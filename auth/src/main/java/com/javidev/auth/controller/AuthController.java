package com.javidev.auth.controller;

import com.javidev.auth.dto.LoginRequestDTO;
import com.javidev.auth.dto.LoginResponseDTO;
import com.javidev.auth.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public LoginResponseDTO login(@RequestBody @Valid LoginRequestDTO loginRequest) {
        return authService.login(loginRequest.getEmail(), loginRequest.getPassword());
    }
}
