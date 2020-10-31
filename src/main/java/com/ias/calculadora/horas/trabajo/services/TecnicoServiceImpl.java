package com.ias.calculadora.horas.trabajo.services;

import java.util.List;
import java.util.Optional;

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
	public Optional<Tecnico> findById(Long id) {
		return tecnicoDao.findById(id);
	}

	@Override
	public Tecnico save(Tecnico tecnico) {
		return tecnicoDao.save(tecnico);
	}

}
