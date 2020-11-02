package com.ias.calculadora.horas.trabajo.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaInicio;
	
	@Column(name="fecha_fin")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaFin;
	
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
	
	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	
	private static final long serialVersionUID = 1L;
	
}
