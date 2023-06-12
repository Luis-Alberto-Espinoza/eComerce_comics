package com.comicsmarket.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comicsmarket.apirest.enties.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {

}
