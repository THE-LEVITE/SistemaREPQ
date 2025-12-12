package com.repq.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "fichas")
public class Ficha {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String numeroFicha;

	private String programa;

	// Getters y Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroFicha() {
		return numeroFicha;
	}

	public void setNumeroFicha(String numeroFicha) {
		this.numeroFicha = numeroFicha;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}
}
