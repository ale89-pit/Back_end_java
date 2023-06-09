package com.GestionePrenotazioni.Project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionePrenotazioni.Project.model.ERole;
import com.GestionePrenotazioni.Project.model.Role;

public interface RoleDAO extends JpaRepository<Role, Long> {
	
	Optional<Role> findByRoleName(ERole roleName);
}
