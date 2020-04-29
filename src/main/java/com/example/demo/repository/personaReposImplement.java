package com.example.demo.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.example.demo.InyeccionDependenciasConsolaApplication;

@Repository
@Qualifier("persona1")

public class personaReposImplement implements Ipersona {

	private static  Logger LOG = LoggerFactory.getLogger(InyeccionDependenciasConsolaApplication.class);
	
	
	@Override
	public void registrar(String nombre) {
		LOG.info("Se registro exitosament a" + nombre);
		
	}
	
	

}
