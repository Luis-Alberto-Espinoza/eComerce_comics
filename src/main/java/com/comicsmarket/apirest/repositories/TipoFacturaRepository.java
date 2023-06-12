package com.comicsmarket.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comicsmarket.apirest.enties.TipoFactura;

@Repository
public interface TipoFacturaRepository extends JpaRepository<TipoFactura, Long> {

}
