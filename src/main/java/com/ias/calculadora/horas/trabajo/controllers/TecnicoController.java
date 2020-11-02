package com.ias.calculadora.horas.trabajo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ias.calculadora.horas.trabajo.models.Tecnico;
import com.ias.calculadora.horas.trabajo.services.ITecnicoService;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class TecnicoController {

	@Autowired
	private ITecnicoService tecnicoService;

	@GetMapping("/tecnicos")
	public List<Tecnico> index() {
		return tecnicoService.findAll();
	}

	@GetMapping("/tecnicos/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Tecnico show(@PathVariable Long id) {
		return tecnicoService.findById(id);
	}
	
	@PostMapping("/tecnicos")
	@ResponseStatus(HttpStatus.CREATED)
	public Tecnico create(@RequestBody Tecnico tecnico) {
		return tecnicoService.save(tecnico);
	}

}
