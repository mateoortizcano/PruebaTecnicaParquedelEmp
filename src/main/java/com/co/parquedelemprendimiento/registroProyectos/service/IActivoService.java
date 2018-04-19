package com.co.parquedelemprendimiento.registroProyectos.service;

import java.util.List;

import com.co.parquedelemprendimiento.registroProyectos.entities.ActivoDerivado;

public interface IActivoService {
	
	void update(ActivoDerivado proyecto);
	
	void insert(ActivoDerivado proyecto);
	
	List<ActivoDerivado> obtenerTodosByIdProyecto(Integer id);
}
