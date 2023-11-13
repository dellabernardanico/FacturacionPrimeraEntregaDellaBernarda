package com.example.models;

import jakarta.persistence.*;

@Entity
@Table(name="productos")
public class ProductoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descripcion;
    private String codigo;
    private int stock;
    @Column(name="price")
    private double precio;

}
