package com.comicsmarket.apirest.services;

import com.comicsmarket.apirest.enties.Factura;
import com.comicsmarket.apirest.repositories.FacturaRepository;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class FacturaService implements BaseService<Factura>{
	
	private FacturaRepository facturaRepository;
	
	public FacturaService(FacturaRepository facturaRepository) {
		this.facturaRepository = facturaRepository;
	}

	@Override
	@Transactional
	public List<Factura> findall() throws Exception {
		try {
			List<Factura> entities = facturaRepository.findAll();
			return entities;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Factura findById(Long id) throws Exception {
		try {
			Optional<Factura> entityOptional = facturaRepository.findById(id);
			return entityOptional.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Factura save(Factura entity) throws Exception {
		try {
			entity = facturaRepository.save(entity);
			return entity;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Factura update(Long id, Factura entity) throws Exception {
		try {
			Optional<Factura> entityOptional = facturaRepository.findById(id);
			Factura factura = entityOptional.get();
			factura = facturaRepository.save(entity);
			return factura;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public boolean delete(Long id) throws Exception {
		try {
			if(facturaRepository.existsById(id)) {
				facturaRepository.deleteById(id);
				return true;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
