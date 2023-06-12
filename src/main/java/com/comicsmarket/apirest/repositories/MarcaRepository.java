package com.comicsmarket.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.comicsmarket.apirest.enties.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
