package com.comicsmarket.apirest.services;

import com.comicsmarket.apirest.enties.Marca;
import com.comicsmarket.apirest.repositories.MarcaRepository;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class MarcaService implements BaseService<Marca>{
	
	private MarcaRepository marcaRepository;
	
	public MarcaService(MarcaRepository marcaRepository) {
		this.marcaRepository = marcaRepository;
	}

	@Override
	@Transactional
	public List<Marca> findall() throws Exception {
		try {
			List<Marca> entities = marcaRepository.findAll();
			return entities;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Marca findById(Long id) throws Exception {
		try {
			Optional<Marca> entityOptional = marcaRepository.findById(id);
			return entityOptional.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Marca save(Marca entity) throws Exception {
		try {
			entity = marcaRepository.save(entity);
			return entity;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Marca update(Long id, Marca entity) throws Exception {
		try {
			Optional<Marca> entityOptional = marcaRepository.findById(id);
			Marca marca = entityOptional.get();
			marca = marcaRepository.save(entity);
			return marca;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public boolean delete(Long id) throws Exception {
		try {
			if(marcaRepository.existsById(id)) {
				marcaRepository.deleteById(id);
				return true;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
