package com.ias.calculadora.horas.trabajo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ias.calculadora.horas.trabajo.dao.ITecnicoDao;
import com.ias.calculadora.horas.trabajo.models.Tecnico;

// Decorator como componente de Spring
@Service
public class TecnicoServiceImpl implements ITecnicoService{

	@Autowired
	private ITecnicoDao tecnicoDao;
	
	@Override
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public List<Tecnico> findAll() {
		return (List<Tecnico>) tecnicoDao.findAll();
	}


	@Override
	public Tecnico save(Tecnico tecnico) {
		return tecnicoDao.save(tecnico);
	}

	@Override
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public Tecnico findById(Long id) {
		// Retorna un Optional nos permite manejar el contenido de la consulta
		return tecnicoDao.findById(id).orElse(null);
	}
	
	

}
