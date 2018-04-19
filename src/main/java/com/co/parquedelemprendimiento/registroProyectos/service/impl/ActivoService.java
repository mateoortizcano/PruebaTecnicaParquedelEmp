package com.co.parquedelemprendimiento.registroProyectos.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.co.parquedelemprendimiento.registroProyectos.entities.ActivoDerivado;
import com.co.parquedelemprendimiento.registroProyectos.repository.IActivoRespository;
import com.co.parquedelemprendimiento.registroProyectos.service.IActivoService;


@Service
public class ActivoService implements IActivoService {
	
	@Autowired
	private IActivoRespository activoRespository;
	
	@PersistenceContext
    private EntityManager manager;

	@Override
	public void update(ActivoDerivado activo) {
		activoRespository.save(activo);

	}

	@Override
	public void insert(ActivoDerivado activo) {
		activoRespository.save(activo);

	}

	@Override
	@Transactional(readOnly = true)
	public List<ActivoDerivado> obtenerTodosByIdProyecto(Integer id) {
		List<ActivoDerivado> activoDerivados;
			activoDerivados = manager.createNamedQuery("listarActivosPorProyecto",ActivoDerivado.class)
					.setParameter(1, id).getResultList();
		return activoDerivados;
	}
}
