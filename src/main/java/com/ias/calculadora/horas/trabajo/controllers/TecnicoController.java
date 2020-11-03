package com.ias.calculadora.horas.trabajo.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<?> show(@PathVariable Long id) {
		
		Tecnico tecnico = null;
		
		Map<String, Object> response = new HashMap<>();
			
		try {
			tecnico = tecnicoService.findById(id);
		}catch (DataAccessException e) {
			response.put("mensaje", "Error al realizar la consulta en la bd");
			response.put("error", e.getMessage().concat(":").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(HttpStatus.NOT_FOUND);
		}
		
		if(tecnico == null) {
			response.put("mensaje", "El servicio con ID: ".concat(id.toString().concat(" No Existe en la BD")));
			return new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Tecnico>(tecnico, HttpStatus.OK);
	}
	
	@PostMapping("/tecnicos")
	public ResponseEntity<?> create(@RequestBody Tecnico tecnico) {
		
		Tecnico tecnicoNew = null;
		
		Map<String, Object> response = new HashMap<>();
		
		try {	
			tecnicoNew = tecnicoService.save(tecnico);
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al realizar Intertar en la bd");
			response.put("error", e.getMessage().concat(":").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		response.put("mensaje", "El Servicio ha sido creado con Exito");
		response.put("tecnico", tecnicoNew);
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.CREATED);
		
	}

}
