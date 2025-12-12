package com.repq.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "equipos")
public class Equipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nombreEquipo;

	private String numeroSerie;

	@Column(unique = true)
	private String codigoQR;

	@ManyToOne
	@JoinColumn(name = "aprendiz_id")
	private Aprendiz aprendiz;

	// Getters y Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getCodigoQR() {
		return codigoQR;
	}

	public void setCodigoQR(String codigoQR) {
		this.codigoQR = codigoQR;
	}

	public Aprendiz getAprendiz() {
		return aprendiz;
	}

	public void setAprendiz(Aprendiz aprendiz) {
		this.aprendiz = aprendiz;
	}
}
