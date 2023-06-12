package com.comicsmarket.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.comicsmarket.apirest.enties.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
