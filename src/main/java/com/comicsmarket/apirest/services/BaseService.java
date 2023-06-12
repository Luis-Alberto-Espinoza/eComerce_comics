package com.comicsmarket.apirest.services;


import java.util.List;


public interface BaseService<E> {
	
	public List<E> findall() throws Exception;
	
	public E findById (Long id)throws Exception;
	
	public E save (E entity)throws Exception;
	
	public E update(Long id, E entity) throws Exception;
	
	public boolean delete(Long id) throws Exception;

}
