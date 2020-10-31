package com.ias.calculadora.horas.trabajo.services;

import java.util.List;
import java.util.Optional;

import com.ias.calculadora.horas.trabajo.models.Tecnico;

public interface ITecnicoService {
	
	public List<Tecnico> findAll();
	public Optional<Tecnico> findById(Long id);
	public Tecnico save(Tecnico tecnico);
	

}
