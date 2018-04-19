package com.co.parquedelemprendimiento.registroProyectos.models;

import org.springframework.stereotype.Service;

@Service
public class ActivoModel {
	private String nombre;
	private String id;
	private String estadoDeDesarrollo;
	private String tipoActivo;
	private String idProyecto;
	private ProyectoModel proyecto;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstadoDeDesarrollo() {
		return estadoDeDesarrollo;
	}
	public void setEstadoDeDesarrollo(String estadoDeDesarrollo) {
		this.estadoDeDesarrollo = estadoDeDesarrollo;
	}
	public String getTipoActivo() {
		return tipoActivo;
	}
	public void setTipoActivo(String tipoActivo) {
		this.tipoActivo = tipoActivo;
	}
	public ProyectoModel getProyecto() {
		return proyecto;
	}
	public void setProyecto(ProyectoModel model) {
		this.proyecto = model;
	}
	public String getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}
	
	

}
