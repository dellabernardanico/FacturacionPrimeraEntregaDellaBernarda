package com.example.repository;

import com.example.models.FacturaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<FacturaModel, Integer> {

}
