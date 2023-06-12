package com.comicsmarket.apirest.services;

import com.comicsmarket.apirest.enties.Usuario;
import com.comicsmarket.apirest.repositories.UsuarioRepository;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class UsuarioService implements BaseService<Usuario>{
	
	private UsuarioRepository usuarioRepository;
	
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	@Transactional
	public List<Usuario> findall() throws Exception {
		try {
			List<Usuario> entities = usuarioRepository.findAll();
			return entities;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Usuario findById(Long id) throws Exception {
		try {
			Optional<Usuario> entityOptional = usuarioRepository.findById(id);
			return entityOptional.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Usuario save(Usuario entity) throws Exception {
		try {
			entity = usuarioRepository.save(entity);
			return entity;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Usuario update(Long id, Usuario entity) throws Exception {
		try {
			Optional<Usuario> entityOptional = usuarioRepository.findById(id);
			Usuario Usuario = entityOptional.get();
			Usuario = usuarioRepository.save(entity);
			return Usuario;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public boolean delete(Long id) throws Exception {
		try {
			if(usuarioRepository.existsById(id)) {
				usuarioRepository.deleteById(id);
				return true;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
