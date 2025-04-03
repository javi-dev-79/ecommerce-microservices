package com.javidev.auth.service;

import com.javidev.auth.dto.LoginResponseDTO;

public interface AuthService {

    LoginResponseDTO login(String email, String password);

}
