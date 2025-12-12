package com.repq.entidad;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "historial_movimientos")
public class HistorialMovimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_mov;

    @Enumerated(EnumType.STRING)
    private TipoMovimiento tipo;

    private LocalDateTime fecha_hora = LocalDateTime.now();

    // RELACIÓN: muchos historial -> un equipo
    @ManyToOne
    @JoinColumn(name = "id_equipo")
    private Equipo equipo;

    // RELACIÓN: muchos historial -> un aprendiz
    @ManyToOne
    @JoinColumn(name = "id_aprendiz")
    private Aprendiz aprendiz;

    // RELACIÓN: muchos historial -> un admin
    @ManyToOne
    @JoinColumn(name = "id_admin")
    private Administrador admin;

    public HistorialMovimiento() {}

    public Integer getId_mov() { return id_mov; }
    public void setId_mov(Integer id_mov) { this.id_mov = id_mov; }

    public TipoMovimiento getTipo() { return tipo; }
    public void setTipo(TipoMovimiento tipo) { this.tipo = tipo; }

    public LocalDateTime getFecha_hora() { return fecha_hora; }
    public void setFecha_hora(LocalDateTime fecha_hora) { this.fecha_hora = fecha_hora; }

    public Equipo getEquipo() { return equipo; }
    public void setEquipo(Equipo equipo) { this.equipo = equipo; }

    public Aprendiz getAprendiz() { return aprendiz; }
    public void setAprendiz(Aprendiz aprendiz) { this.aprendiz = aprendiz; }

    public Administrador getAdmin() { return admin; }
    public void setAdmin(Administrador admin) { this.admin = admin; }
}
