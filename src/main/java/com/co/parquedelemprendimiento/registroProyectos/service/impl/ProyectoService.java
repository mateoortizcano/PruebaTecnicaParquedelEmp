package com.co.parquedelemprendimiento.registroProyectos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.parquedelemprendimiento.registroProyectos.entities.Proyecto;
import com.co.parquedelemprendimiento.registroProyectos.repository.IProyectoRepository;
import com.co.parquedelemprendimiento.registroProyectos.service.IProyectoService;

@Service
public class ProyectoService implements IProyectoService {
	
	@Autowired
	private IProyectoRepository proyectoRepository;

	@Override
	public void insert(Proyecto proyecto) {
		proyectoRepository.save(proyecto);
	}
	
	@Override
	public void update(Proyecto proyecto) {
		proyectoRepository.save(proyecto);		
		
	}
	
	@Override
	public Proyecto findById(Integer id) {
		return proyectoRepository.getOne(id);
	}

	@Override
	public List<Proyecto> obtenerTodos() { 
		return proyectoRepository.findAll();
	}
}
