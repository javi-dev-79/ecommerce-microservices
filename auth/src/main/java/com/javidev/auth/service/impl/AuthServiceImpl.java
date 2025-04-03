package com.javidev.auth.service.impl;

import com.javidev.auth.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String getHelloMessage() {
        return "Hello from AuthService!";
    }
}
