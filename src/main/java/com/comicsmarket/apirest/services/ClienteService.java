package com.comicsmarket.apirest.services;

import com.comicsmarket.apirest.enties.Cliente;
import com.comicsmarket.apirest.repositories.ClienteRepository;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class ClienteService implements BaseService<Cliente>{
	
	private ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	@Override
	@Transactional
	public List<Cliente> findall() throws Exception {
		try {
			List<Cliente> entities = clienteRepository.findAll();
			return entities;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Cliente findById(Long id) throws Exception {
		try {
			Optional<Cliente> entityOptional = clienteRepository.findById(id);
			return entityOptional.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Cliente save(Cliente entity) throws Exception {
		try {
			entity = clienteRepository.save(entity);
			return entity;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Cliente update(Long id, Cliente entity) throws Exception {
		try {
			Optional<Cliente> entityOptional = clienteRepository.findById(id);
			Cliente cliente = entityOptional.get();
			cliente = clienteRepository.save(entity);
			return cliente;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public boolean delete(Long id) throws Exception {
		try {
			if(clienteRepository.existsById(id)) {
				clienteRepository.deleteById(id);
				return true;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
