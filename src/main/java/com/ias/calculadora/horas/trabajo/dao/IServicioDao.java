package com.ias.calculadora.horas.trabajo.dao;

import org.springframework.data.repository.CrudRepository;

import com.ias.calculadora.horas.trabajo.models.Servicio;

public interface IServicioDao extends CrudRepository<Servicio, Long>{

}
