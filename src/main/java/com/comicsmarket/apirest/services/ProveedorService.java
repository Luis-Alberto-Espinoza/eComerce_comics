package com.comicsmarket.apirest.services;

import com.comicsmarket.apirest.enties.Proveedor;
import com.comicsmarket.apirest.repositories.ProveedorRepository;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class ProveedorService implements BaseService<Proveedor>{
	
	private ProveedorRepository proveedorRepository;
	
	public ProveedorService(ProveedorRepository proveedorRepository) {
		this.proveedorRepository = proveedorRepository;
	}

	@Override
	@Transactional
	public List<Proveedor> findall() throws Exception {
		try {
			List<Proveedor> entities = proveedorRepository.findAll();
			return entities;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Proveedor findById(Long id) throws Exception {
		try {
			Optional<Proveedor> entityOptional = proveedorRepository.findById(id);
			return entityOptional.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Proveedor save(Proveedor entity) throws Exception {
		try {
			entity = proveedorRepository.save(entity);
			return entity;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Proveedor update(Long id, Proveedor entity) throws Exception {
		try {
			Optional<Proveedor> entityOptional = proveedorRepository.findById(id);
			Proveedor proveedor = entityOptional.get();
			proveedor = proveedorRepository.save(entity);
			return proveedor;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public boolean delete(Long id) throws Exception {
		try {
			if(proveedorRepository.existsById(id)) {
				proveedorRepository.deleteById(id);
				return true;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
