package com.co.parquedelemprendimiento.registroProyectos.converter;

import com.co.parquedelemprendimiento.registroProyectos.entities.ActivoDerivado;
import com.co.parquedelemprendimiento.registroProyectos.entities.Proyecto;
import com.co.parquedelemprendimiento.registroProyectos.models.ActivoModel;
import com.co.parquedelemprendimiento.registroProyectos.models.ProyectoModel;

public class ActivoConverter {
	
	public ActivoDerivado toEntity(ActivoModel activoModel){
		ProyectoConverter converter = new ProyectoConverter();
		
		ActivoDerivado activoDerivado = new ActivoDerivado();
		activoDerivado.setNombre(activoModel.getNombre());
		activoDerivado.setEstadoDeDesarrollo(activoModel.getEstadoDeDesarrollo());
		activoDerivado.setTipoActivo(activoModel.getTipoActivo());		
		Proyecto proyecto = converter.toEntity(activoModel.getProyecto());
		proyecto.setId(activoModel.getProyecto().getNumero());
		activoDerivado.setProyecto(proyecto);
		return activoDerivado;
	}
	
	public ActivoModel toModel(ActivoDerivado activoDerivado){
		ProyectoConverter converter = new ProyectoConverter();
		
		ActivoModel activoModel = new ActivoModel();
		activoModel.setNombre(activoDerivado.getNombre());
		activoModel.setEstadoDeDesarrollo(activoDerivado.getEstadoDeDesarrollo());
		activoModel.setTipoActivo(activoDerivado.getTipoActivo());		
		ProyectoModel proyecto = converter.toModel(activoDerivado.getProyecto());
		proyecto.setNumero(activoDerivado.getProyecto().getId());
		activoModel.setProyecto(proyecto);
		return activoModel;
	}
}
