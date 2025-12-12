package com.repq.entidad;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "administradores")
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_admin;

    private String nombre;

    @Column(unique = true)
    private String usuario;

    @Column(unique = true)
    private String correo;

    private String contraseña;

    private LocalDateTime fecha_creacion = LocalDateTime.now();

    // Constructor vacío
    public Administrador() {}

    // Getters y Setters
    public Integer getId_admin() { return id_admin; }
    public void setId_admin(Integer id_admin) { this.id_admin = id_admin; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }

    public LocalDateTime getFecha_creacion() { return fecha_creacion; }
    public void setFecha_creacion(LocalDateTime fecha_creacion) { this.fecha_creacion = fecha_creacion; }
}
