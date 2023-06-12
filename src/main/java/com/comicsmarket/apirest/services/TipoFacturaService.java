package com.comicsmarket.apirest.services;

import com.comicsmarket.apirest.enties.TipoFactura;
import com.comicsmarket.apirest.repositories.TipoFacturaRepository;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class TipoFacturaService implements BaseService<TipoFactura>{
	
	private TipoFacturaRepository tipoFacturaRepository;
	
	public TipoFacturaService(TipoFacturaRepository tipoFacturaRepository) {
		this.tipoFacturaRepository = tipoFacturaRepository;
	}

	@Override
	@Transactional
	public List<TipoFactura> findall() throws Exception {
		try {
			List<TipoFactura> entities = tipoFacturaRepository.findAll();
			return entities;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public TipoFactura findById(Long id) throws Exception {
		try {
			Optional<TipoFactura> entityOptional = tipoFacturaRepository.findById(id);
			return entityOptional.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public TipoFactura save(TipoFactura entity) throws Exception {
		try {
			entity = tipoFacturaRepository.save(entity);
			return entity;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public TipoFactura update(Long id, TipoFactura entity) throws Exception {
		try {
			Optional<TipoFactura> entityOptional = tipoFacturaRepository.findById(id);
			TipoFactura tipoFactura = entityOptional.get();
			tipoFactura = tipoFacturaRepository.save(entity);
			return tipoFactura;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public boolean delete(Long id) throws Exception {
		try {
			if(tipoFacturaRepository.existsById(id)) {
				tipoFacturaRepository.deleteById(id);
				return true;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
