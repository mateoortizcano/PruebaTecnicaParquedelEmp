package com.co.parquedelemprendimiento.registroProyectos.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

@Entity
@NamedNativeQueries({
	@NamedNativeQuery(
			name="listarActivosPorProyecto",
			query="SELECT * FROM public.activo_derivado WHERE proyecto_id = ?1 ",
			resultClass=ActivoDerivado.class
	)
})
public class ActivoDerivado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="estado_de_desarrollo")
	private String estadoDeDesarrollo;
	@Column(name="tipo_activo")
	private String tipoActivo;
	
	@ManyToOne
	private Proyecto proyecto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

}
