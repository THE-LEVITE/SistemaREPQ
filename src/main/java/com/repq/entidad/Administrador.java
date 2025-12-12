package com.repq.entidad;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "administradores")
public class Administrador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Anotacion JASON
	private Integer id;
	private String nombre;
	private String usuario;
	private String password;
	private String email;
	private Date fecha_creacion;


}
