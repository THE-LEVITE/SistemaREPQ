package com.repq.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "aprendices")
public class Aprendiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_aprendiz;

    private String nombre;
    private String ficha;

    public Aprendiz() {}

    public Integer getId_aprendiz() { return id_aprendiz; }
    public void setId_aprendiz(Integer id_aprendiz) { this.id_aprendiz = id_aprendiz; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getFicha() { return ficha; }
    public void setFicha(String ficha) { this.ficha = ficha; }
}
