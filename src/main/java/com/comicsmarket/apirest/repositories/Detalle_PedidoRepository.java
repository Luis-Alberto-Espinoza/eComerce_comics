package com.comicsmarket.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comicsmarket.apirest.enties.Detalle_Pedido;

@Repository
public interface Detalle_PedidoRepository extends JpaRepository<Detalle_Pedido, Long> {

}
