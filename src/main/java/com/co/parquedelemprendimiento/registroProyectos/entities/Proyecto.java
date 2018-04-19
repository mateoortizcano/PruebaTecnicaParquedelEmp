package com.co.parquedelemprendimiento.registroProyectos.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto implements Serializable {
	
	public Proyecto() {
		super();
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2998237971779067010L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name = "marcador")
	private String marcador;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "sector_tecnologico")
	private String sectorTecnologico;
	@Column(name = "grupo_investigacion")
	private String grupoInvestigacion;
	@Column(name = "quien_diligencia")
	private String quienDiligencia;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "numero_activos")
	private Integer numeroActivos;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarcador() {
		return marcador;
	}
	public void setMarcador(String marcador) {
		this.marcador = marcador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSectorTecnologico() {
		return sectorTecnologico;
	}
	public void setSectorTecnologico(String sectorTecnologico) {
		this.sectorTecnologico = sectorTecnologico;
	}
	public String getGrupoInvestigacion() {
		return grupoInvestigacion;
	}
	public void setGrupoInvestigacion(String grupoInvestigacion) {
		this.grupoInvestigacion = grupoInvestigacion;
	}
	public String getQuienDiligencia() {
		return quienDiligencia;
	}
	public void setQuienDiligencia(String quienDiligencia) {
		this.quienDiligencia = quienDiligencia;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getNumeroActivos() {
		return numeroActivos;
	}
	public void setNumeroActivos(Integer numeroActivos) {
		this.numeroActivos = numeroActivos;
	}

}
