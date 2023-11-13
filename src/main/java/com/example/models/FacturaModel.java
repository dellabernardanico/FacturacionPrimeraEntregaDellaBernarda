package com.example.models;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="factura")
public class FacturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name="clientes_id")
    private ClienteModel cliente;
    @Column(name="fecha_creacion")
    private Date fechaCreacion;
    private double total;
}
