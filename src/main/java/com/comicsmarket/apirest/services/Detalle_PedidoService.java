package com.comicsmarket.apirest.services;

import com.comicsmarket.apirest.enties.Detalle_Pedido;
import com.comicsmarket.apirest.repositories.Detalle_PedidoRepository;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class Detalle_PedidoService implements BaseService<Detalle_Pedido>{
	
	private Detalle_PedidoRepository detalle_pedidoRepository;
	
	public Detalle_PedidoService(Detalle_PedidoRepository detalle_pedidoRepository) {
		this.detalle_pedidoRepository = detalle_pedidoRepository;
	}

	@Override
	@Transactional
	public List<Detalle_Pedido> findall() throws Exception {
		try {
			List<Detalle_Pedido> entities = detalle_pedidoRepository.findAll();
			return entities;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Detalle_Pedido findById(Long id) throws Exception {
		try {
			Optional<Detalle_Pedido> entityOptional = detalle_pedidoRepository.findById(id);
			return entityOptional.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Detalle_Pedido save(Detalle_Pedido entity) throws Exception {
		try {
			entity = detalle_pedidoRepository.save(entity);
			return entity;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Detalle_Pedido update(Long id, Detalle_Pedido entity) throws Exception {
		try {
			Optional<Detalle_Pedido> entityOptional = detalle_pedidoRepository.findById(id);
			Detalle_Pedido Detalle_Producto = entityOptional.get();
			Detalle_Producto = detalle_pedidoRepository.save(entity);
			return Detalle_Producto;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public boolean delete(Long id) throws Exception {
		try {
			if(detalle_pedidoRepository.existsById(id)) {
				detalle_pedidoRepository.deleteById(id);
				return true;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
