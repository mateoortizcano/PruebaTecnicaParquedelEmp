package com.co.parquedelemprendimiento.registroProyectos.managers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.parquedelemprendimiento.registroProyectos.converter.ActivoConverter;
import com.co.parquedelemprendimiento.registroProyectos.entities.ActivoDerivado;
import com.co.parquedelemprendimiento.registroProyectos.models.ActivoModel;
import com.co.parquedelemprendimiento.registroProyectos.models.ProyectoModel;
import com.co.parquedelemprendimiento.registroProyectos.service.IActivoService;

@Service
public class ActivoManager {
	@Autowired
	private IActivoService activoService;
	@Autowired
	private ProyectoManager proyectoManager;
	
	public void registrarActivo(ActivoModel activoModel){
		ActivoConverter activoConverter = new ActivoConverter();
		ProyectoModel model= proyectoManager.consultarById(Integer.parseInt(activoModel.getIdProyecto()));
		activoModel.setProyecto(model);
		proyectoManager.sumarActivoAProyecto(model);
		activoService.insert(activoConverter.toEntity(activoModel));
	}
	
	public List<ActivoModel> obtenerActivos(Integer id){
		List<ActivoModel> activosModel;
		List<ActivoDerivado> activosEntity;
		ActivoConverter activoConverter = new ActivoConverter();
		activosEntity = activoService.obtenerTodosByIdProyecto(id);
		activosModel = activosEntity.stream().map(ActivoModel -> activoConverter.toModel(ActivoModel))
				.collect(Collectors.toList());
		return activosModel;
	}
}
