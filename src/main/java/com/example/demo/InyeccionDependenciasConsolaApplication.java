package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.Ipersona;





@SpringBootApplication
public class InyeccionDependenciasConsolaApplication implements CommandLineRunner  {

	
	private static  Logger LOG = LoggerFactory.getLogger(InyeccionDependenciasConsolaApplication.class);

	@Autowired
	@Qualifier("persona1")
	private    Ipersona servi;
	
	@Override
	public void run(String... args) throws Exception {

		servi.registrar(" Jan");
		
	}
	

	public static void main(String[] args) {
		SpringApplication.run(InyeccionDependenciasConsolaApplication.class, args);

	
	}
	
	
	

}
