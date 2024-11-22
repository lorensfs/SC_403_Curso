package com.practica1.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name = "ImagePath")  // Match the exact database column name
    private String imagePath;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Tipo")
    private String tipo;

    @Column(name = "GradoDureza")  // Match the database column
    private Integer gradoDureza;

    @Column(name = "Activo")
    private boolean activo;

    public Arbol() {
    }

    public Arbol(String imagePath, String nombre, String tipo, int gradoDureza) {
        this.imagePath = imagePath;
        this.nombre = nombre;
        this.tipo = tipo;
        this.gradoDureza = gradoDureza;
        this.activo = true; // Default to true
    }
}