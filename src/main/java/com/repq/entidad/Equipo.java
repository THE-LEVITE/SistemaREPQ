package com.repq.entidad;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "equipos")
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_equipo;

    private String nombre_equipo;

    @Column(unique = true)
    private String serial;

    @Column(unique = true)
    private String qr_code;

    private LocalDateTime fecha_registro = LocalDateTime.now();

    // RELACIÓN: Muchos equipos -> un aprendiz
    @ManyToOne
    @JoinColumn(name = "id_aprendiz")
    private Aprendiz aprendiz;

    public Equipo() {}

    public Integer getId_equipo() { return id_equipo; }
    public void setId_equipo(Integer id_equipo) { this.id_equipo = id_equipo; }

    public String getNombre_equipo() { return nombre_equipo; }
    public void setNombre_equipo(String nombre_equipo) { this.nombre_equipo = nombre_equipo; }

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }

    public String getQr_code() { return qr_code; }
    public void setQr_code(String qr_code) { this.qr_code = qr_code; }

    public LocalDateTime getFecha_registro() { return fecha_registro; }
    public void setFecha_registro(LocalDateTime fecha_registro) { this.fecha_registro = fecha_registro; }

    public Aprendiz getAprendiz() { return aprendiz; }
    public void setAprendiz(Aprendiz aprendiz) { this.aprendiz = aprendiz; }
}
