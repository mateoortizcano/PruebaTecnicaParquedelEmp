package com.co.parquedelemprendimiento.registroProyectos.managers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.parquedelemprendimiento.registroProyectos.converter.ProyectoConverter;
import com.co.parquedelemprendimiento.registroProyectos.entities.Proyecto;
import com.co.parquedelemprendimiento.registroProyectos.models.ProyectoModel;
import com.co.parquedelemprendimiento.registroProyectos.service.IProyectoService;

@Service
public class ProyectoManager {
	
	@Autowired
	private IProyectoService proyectoService;
	
	public void registrarProyecto(ProyectoModel proyectoModel) {
		proyectoModel.setNumeroActivos(0);
		ProyectoConverter converter =new ProyectoConverter();
		proyectoService.insert(converter.toEntity(proyectoModel));
	}
	
	public List<ProyectoModel> obtenerProyectos(){
		
		List<ProyectoModel> proyectosModel;
		List<Proyecto> proyectosEntity;
		ProyectoConverter converter =new ProyectoConverter();
		proyectosEntity = proyectoService.obtenerTodos();
		proyectosModel = proyectosEntity.stream().map(ProyectoModel -> converter.toModel(ProyectoModel))
				.collect(Collectors.toList());
		return proyectosModel;

	}
	
	public ProyectoModel consultarById(Integer id){
		ProyectoConverter converter =new ProyectoConverter();
		return converter.toModel(proyectoService.findById(id));
	}
	
	public void sumarActivoAProyecto(ProyectoModel proyectoModel){
		proyectoModel.setNumeroActivos(proyectoModel.getNumeroActivos()+1);
		ProyectoConverter converter =new ProyectoConverter();
		Proyecto proyecto = converter.toEntity(proyectoModel);
		proyecto.setId(proyectoModel.getNumero());
		proyectoService.update(proyecto);
	}
}
