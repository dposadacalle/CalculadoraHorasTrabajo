package com.ias.calculadora.horas.trabajo.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "servicios")
public class Tecnico implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ident_tecnico", length = 30, nullable = false)
	private String identTecnico;
	
	@Column(name="ident_servicio", length = 30, nullable = false)
	private String identServicio;
	
	@Column(name="fecha_inicio", nullable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate fechaInicio;
	
	@Column(name="fecha_fin", nullable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate fechaFin;
	
	@Column(name="hora_inicio", nullable = false)
	@JsonFormat(pattern = "hh:mm:ss a")
	private LocalTime horaInicio;
	
	@Column(name="hora_fin", nullable = false)
	@JsonFormat(pattern = "hh:mm:ss a")
	private LocalTime horaFin;
	
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
	
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}


	private static final long serialVersionUID = 1L;
	
}
