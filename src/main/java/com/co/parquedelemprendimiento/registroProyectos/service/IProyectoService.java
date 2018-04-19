package com.co.parquedelemprendimiento.registroProyectos.service;

import java.util.List;

import com.co.parquedelemprendimiento.registroProyectos.entities.Proyecto;

public interface IProyectoService {
	
	Proyecto findById(Integer id);
	
	void update(Proyecto proyecto);
	
	void insert(Proyecto proyecto);
	
	List<Proyecto> obtenerTodos();
	
}
