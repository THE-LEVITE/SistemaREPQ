package com.repq.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "equipos")
public class Equipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, length = 200)
	private String nombre;

	@Column(name = "numero_serie", nullable = false, length = 120, unique = true)
	private String numeroSerie;

	@Column(columnDefinition = "TEXT")
	private String descripcion;

	@Column(name = "codigo_qr", length = 255, unique = true)
	private String codigoQr; // puede ser una cadena que identifique el QR

	@Column(length = 200)
	private String aprendiz; // nombre del aprendiz propietario (si quieres normalizar, crear entidad
								// Aprendiz)

	@Column(name = "numero_ficha", length = 50)
	private String numeroFicha;

	@Column(name = "fecha_creacion", nullable = false)
	private LocalDateTime fechaCreacion = LocalDateTime.now();

	@OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Movimiento> movimientos = new ArrayList<>();

	public Equipo() {
	}

	// Getters y setters
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

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigoQr() {
		return codigoQr;
	}

	public void setCodigoQr(String codigoQr) {
		this.codigoQr = codigoQr;
	}

	public String getAprendiz() {
		return aprendiz;
	}

	public void setAprendiz(String aprendiz) {
		this.aprendiz = aprendiz;
	}

	public String getNumeroFicha() {
		return numeroFicha;
	}

	public void setNumeroFicha(String numeroFicha) {
		this.numeroFicha = numeroFicha;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public void addMovimiento(Movimiento m) {
		movimientos.add(m);
		m.setEquipo(this);
	}

	public void removeMovimiento(Movimiento m) {
		movimientos.remove(m);
		m.setEquipo(null);
	}
}
