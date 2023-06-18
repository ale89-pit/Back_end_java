package com.Gestione_Incendi.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Gestione_Incendi.Project.Service.CentroControlloService;
import com.Gestione_Incendi.Project.Service.SondaService;
import com.Gestione_Incendi.Project.model.CentroControllo;
import com.Gestione_Incendi.Project.model.Sonda;

@SpringBootApplication
public class GestioneIncendiApplication {


	public static void main(String[] args) {
		SpringApplication.run(GestioneIncendiApplication.class, args);
//		
//		Sonda s1 = new Sonda();
//		s1.setLat("asdasdads324");
//		s1.setLon("3294398fedsdf");
//		
//		
//		Sonda s2 = new Sonda();
//		s2.setLon("dsadas3443");
//		s2.setLat("asdas34544");
//		CentroControllo c1 = new CentroControllo();
//		c1.setNome("Roma Pompieri Tuscolana");
//		
//		s1.register(c1);
//		s2.register(c1);
//		s2.setSegnaleFumo(4);
//		s1.setSegnaleFumo(6);
	}

}
