package com.co.parquedelemprendimiento.registroProyectos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.co.parquedelemprendimiento.registroProyectos.managers.ActivoManager;
import com.co.parquedelemprendimiento.registroProyectos.managers.ProyectoManager;
import com.co.parquedelemprendimiento.registroProyectos.models.ActivoModel;
import com.co.parquedelemprendimiento.registroProyectos.models.ProyectoModel;

@RestController
public class CrearProyectoController {
		
	@Autowired
	private ProyectoManager proyectoManager;
	@Autowired
	private ActivoManager activoManager;

	@RequestMapping(value="/registrarproyecto", method=RequestMethod.POST)
	public void registrarProyecto(@RequestBody ProyectoModel proyectoModel) {
		proyectoManager.registrarProyecto(proyectoModel);
	}
	
	@RequestMapping(value="/obtenerProyectos", method= RequestMethod.GET)
	public List<ProyectoModel> obtener(){
		return proyectoManager.obtenerProyectos();
	}
	
	@RequestMapping(value="/registrarActivos", method= RequestMethod.POST)
	public void registrarActivo(@RequestBody ActivoModel activoModel){
		activoManager.registrarActivo(activoModel);
	}
	
	@RequestMapping(value="/obtenerProyecto", method= RequestMethod.POST)
	public ProyectoModel obtenerProyecto(@RequestBody Integer id){
		return proyectoManager.consultarById(id);
	}
	
	@RequestMapping(value="/obtenerActivos", method= RequestMethod.POST)
	public List<ActivoModel> obtenerActivos(@RequestBody Integer id){
		return activoManager.obtenerActivos(id);
	}
	
}
