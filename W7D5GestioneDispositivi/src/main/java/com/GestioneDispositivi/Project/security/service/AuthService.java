package com.GestioneDispositivi.Project.security.service;

import com.GestioneDispositivi.Project.security.payload.LoginDto;
import com.GestioneDispositivi.Project.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
