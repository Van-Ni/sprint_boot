package com.example.demo.services;

import com.example.demo.dto.SignUpDTO;
import com.example.demo.dto.UserDTO;

public interface AuthService {
    UserDTO createUser(SignUpDTO signupDTO);
}
