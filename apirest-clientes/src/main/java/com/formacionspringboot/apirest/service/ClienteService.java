package com.formacionspringboot.apirest.service;

import java.util.List;

import com.formacionspringboot.apirest.entity.Cliente;
import com.formacionspringboot.apirest.entity.Region;

public interface ClienteService {

	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public List<Region> findAllRegiones();
	
}
