package com.co.parquedelemprendimiento.registroProyectos.converter;

import com.co.parquedelemprendimiento.registroProyectos.entities.Proyecto;
import com.co.parquedelemprendimiento.registroProyectos.models.ProyectoModel;

public class ProyectoConverter {
	
	public Proyecto toEntity(ProyectoModel proyectoModel){
		Proyecto proyecto = new Proyecto();
		proyecto.setMarcador(proyectoModel.getMarcador());
		proyecto.setNombre(proyectoModel.getNombre());
		proyecto.setSectorTecnologico(proyectoModel.getSectorTecnologico());
		proyecto.setGrupoInvestigacion(proyectoModel.getGrupoInvestigacion());
		proyecto.setQuienDiligencia(proyectoModel.getQuienDiligencia());
		proyecto.setDescripcion(proyectoModel.getDescripcion());
		proyecto.setNumeroActivos(proyectoModel.getNumeroActivos());
		return proyecto;
	}
	
	public ProyectoModel toModel(Proyecto proyecto){
		ProyectoModel proyectoModel = new ProyectoModel();
		proyectoModel.setNumero(proyecto.getId());
		proyectoModel.setMarcador(proyecto.getMarcador());
		proyectoModel.setNombre(proyecto.getNombre());
		proyectoModel.setSectorTecnologico(proyecto.getSectorTecnologico());
		proyectoModel.setGrupoInvestigacion(proyecto.getGrupoInvestigacion());
		proyectoModel.setQuienDiligencia(proyecto.getQuienDiligencia());
		proyectoModel.setDescripcion(proyecto.getDescripcion());
		proyectoModel.setNumeroActivos(proyecto.getNumeroActivos());
		return proyectoModel;
	}
}
