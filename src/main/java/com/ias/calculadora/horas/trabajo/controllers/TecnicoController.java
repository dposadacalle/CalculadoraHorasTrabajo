package com.ias.calculadora.horas.trabajo.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ias.calculadora.horas.trabajo.models.Tecnico;
import com.ias.calculadora.horas.trabajo.services.ITecnicoService;


@CrossOrigin(origins = {"https://localhost:4200"})
@RestController
@RequestMapping("/api")
public class TecnicoController {

	@Autowired
	private ITecnicoService tecnicoService;

	@GetMapping("/tecnicos")
	public List<Tecnico> index() {
		return tecnicoService.findAll();
	}

	// Create new Tecnico
	@PostMapping
	public ResponseEntity<Tecnico> create(Tecnico tecnico) {
		return ResponseEntity.status(HttpStatus.CREATED).body(tecnicoService.save(tecnico));
	}

	// Read an Tecnico
	@GetMapping("/tecnicos/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") Long userId) {
		Optional<Tecnico> tecnico = tecnicoService.findById(userId);

		// Validamos, si no encuentra el tecnico o servicio por ID en la bd
		if (!tecnico.isPresent()) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(tecnico);
	}

	// Read All Tecnicos
	@GetMapping
	public List<Tecnico> readAll() {

		List<Tecnico> tecnicos = StreamSupport.stream(tecnicoService.findAll().spliterator(), false)
				.collect(Collectors.toList());

		return tecnicos;
	}

}
