package com.GestionePrenotazioni.Project.Security.service;

import com.GestionePrenotazioni.Project.Security.payload.LoginDto;
import com.GestionePrenotazioni.Project.Security.payload.RegisterDto;

public interface AuthService {
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
