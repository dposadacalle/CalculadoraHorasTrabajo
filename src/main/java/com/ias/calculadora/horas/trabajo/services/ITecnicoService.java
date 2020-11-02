package com.ias.calculadora.horas.trabajo.services;

import java.util.List;

import com.ias.calculadora.horas.trabajo.models.Tecnico;

public interface ITecnicoService {
	
	public List<Tecnico> findAll();
	public Tecnico findById(Long id);
	public Tecnico save(Tecnico tecnico);
	

}
