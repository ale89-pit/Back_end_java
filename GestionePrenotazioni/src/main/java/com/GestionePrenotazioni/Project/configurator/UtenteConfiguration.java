//package com.GestionePrenotazioni.Project.configurator;
//
//import java.util.Locale;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//
//import com.GestionePrenotazioni.Project.model.Utente;
//import com.github.javafaker.Faker;
//
//@Configuration
//public class UtenteConfiguration {
//	
//	@Value ("${user.admin.name}") private String adminName;
//	@Value ("${user.admin.lastname}") private String adminLastName;
//	@Value ("${user.admin.email}") private String adminEmail;
//	@Value ("${user.admin.username}") private String adminUserName;
//	
//	
//	@Bean(name ="adminUserBean")
//	@Scope("singleton")
//	public Utente adminUtente() {
//		return new Utente (adminUserName,adminName,adminLastName,adminEmail);
//	}
//	@Bean(name ="fakeUserBean")
//	@Scope("prototype")
//	public Utente fakeUtente() {
//		Faker fake = Faker.instance(new Locale("it-IT"));
//		Utente utenteFake = new Utente();
//		utenteFake.setNome(fake.name().firstName());
//		utenteFake.setCognome(fake.name().lastName());
//		utenteFake.setEmail(fake.internet().emailAddress());
//		utenteFake.setUserName(fake.name().username());
//		
//		return utenteFake;
//	}
//	@Bean(name="customUserBean")
//	@Scope("prototype")
//	public Utente customUtente() {
//		
//		
//		return new Utente();
//	}
//	
//}
