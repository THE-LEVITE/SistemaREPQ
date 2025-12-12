package com.repq.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "movimientos")
public class Movimiento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_movimiento", nullable = false, length = 20)
	private TipoMovimiento tipoMovimiento;

	@Column(name = "fecha_hora", nullable = false)
	private LocalDateTime fechaHora = LocalDateTime.now();

	// Datos del equipo (relación)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "equipo_id", nullable = false)
	private Equipo equipo;

	// Datos del aprendiz/usuario al que pertenece el equipo (capturado al momento
	// del movimiento)
	@Column(length = 200)
	private String nombreUsuario;

	@Column(length = 50)
	private String numeroFicha;

	// Administrador que registró el movimiento
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "registrado_por_id")
	private Usuario registradoPor;

	@Column(columnDefinition = "TEXT")
	private String observaciones;

	public Movimiento() {
	}

	// Getters y setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoMovimiento getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getNumeroFicha() {
		return numeroFicha;
	}

	public void setNumeroFicha(String numeroFicha) {
		this.numeroFicha = numeroFicha;
	}

	public Usuario getRegistradoPor() {
		return registradoPor;
	}

	public void setRegistradoPor(Usuario registradoPor) {
		this.registradoPor = registradoPor;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
}
