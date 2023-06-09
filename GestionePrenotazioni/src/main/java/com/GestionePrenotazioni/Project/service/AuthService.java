package com.GestionePrenotazioni.Project.service;

import com.GestionePrenotazioni.Project.Payload.LoginDto;
import com.GestionePrenotazioni.Project.Payload.RegisterDto;

public interface AuthService {
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
