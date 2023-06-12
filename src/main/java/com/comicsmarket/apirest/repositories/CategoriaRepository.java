package com.comicsmarket.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.comicsmarket.apirest.enties.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
