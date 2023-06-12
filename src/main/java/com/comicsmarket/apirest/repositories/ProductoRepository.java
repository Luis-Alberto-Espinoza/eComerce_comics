package com.comicsmarket.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.comicsmarket.apirest.enties.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
