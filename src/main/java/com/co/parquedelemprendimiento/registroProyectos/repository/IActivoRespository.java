package com.co.parquedelemprendimiento.registroProyectos.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.parquedelemprendimiento.registroProyectos.entities.ActivoDerivado;

public interface IActivoRespository extends JpaRepository<ActivoDerivado, Serializable>{

}
