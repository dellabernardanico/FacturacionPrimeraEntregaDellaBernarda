package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.example.repository.ClienteRepository;
import com.example.repository.DetallesFacturaRepository;
import com.example.repository.FacturaRepository;
import com.example.repository.ProductoRepository;

@SpringBootApplication
@EntityScan(basePackages = "com.example.models")
public class App implements CommandLineRunner {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    DetallesFacturaRepository detallesFacturaRepository;

    @Autowired
    FacturaRepository facturaRepository;

    @Autowired
    ProductoRepository productoRepository;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
    }
}
