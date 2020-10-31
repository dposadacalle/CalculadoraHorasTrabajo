package com.ias.calculadora.horas.trabajo.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servicios")
public class Tecnico implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ident_tecnico", length = 30)
	private String identTecnico;
	
	@Column(name="ident_servicio", length = 30)
	private String identServicio;
	
	@Column(name="fecha_inicio")
	private LocalDateTime fechaInicio;
	
	@Column(name="fecha_fin")
	private LocalDateTime fechaFin;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentTecnico() {
		return identTecnico;
	}

	public void setIdentTecnico(String identTecnico) {
		this.identTecnico = identTecnico;
	}

	public String getIdentServicio() {
		return identServicio;
	}

	public void setIdentServicio(String identServicio) {
		this.identServicio = identServicio;
	}
	
	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}

	
	private static final long serialVersionUID = 1L;
	
}
