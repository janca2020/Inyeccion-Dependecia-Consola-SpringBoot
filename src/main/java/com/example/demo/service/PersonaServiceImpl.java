package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.repository.Ipersona;


@Service
public class PersonaServiceImpl implements IpersonaService{

	@Autowired
	@Qualifier("persona2")
	private Ipersona repo;
	
	@Override
	public void registrar(String nombre) {
		
		repo.registrar( nombre);
	}

}
