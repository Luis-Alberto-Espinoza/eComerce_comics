package com.comicsmarket.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.comicsmarket.apirest.enties.Proveedor;


@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {

}
