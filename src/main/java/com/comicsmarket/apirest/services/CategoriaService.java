package com.comicsmarket.apirest.services;

import com.comicsmarket.apirest.enties.Categoria;
import com.comicsmarket.apirest.repositories.CategoriaRepository;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class CategoriaService implements BaseService<Categoria>{
	
	private CategoriaRepository categoriaRepository;
	
	public CategoriaService(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}

	@Override
	@Transactional
	public List<Categoria> findall() throws Exception {
		try {
			List<Categoria> entities = categoriaRepository.findAll();
			return entities;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Categoria findById(Long id) throws Exception {
		try {
			Optional<Categoria> entityOptional = categoriaRepository.findById(id);
			return entityOptional.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Categoria save(Categoria entity) throws Exception {
		try {
			entity = categoriaRepository.save(entity);
			return entity;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Categoria update(Long id, Categoria entity) throws Exception {
		try {
			Optional<Categoria> entityOptional = categoriaRepository.findById(id);
			Categoria Categoria = entityOptional.get();
			Categoria = categoriaRepository.save(entity);
			return Categoria;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public boolean delete(Long id) throws Exception {
		try {
			if(categoriaRepository.existsById(id)) {
				categoriaRepository.deleteById(id);
				return true;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
