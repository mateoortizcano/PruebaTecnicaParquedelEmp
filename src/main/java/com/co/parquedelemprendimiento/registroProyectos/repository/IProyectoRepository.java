package com.co.parquedelemprendimiento.registroProyectos.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.parquedelemprendimiento.registroProyectos.entities.Proyecto;

public interface IProyectoRepository extends JpaRepository<Proyecto, Serializable> {

}
