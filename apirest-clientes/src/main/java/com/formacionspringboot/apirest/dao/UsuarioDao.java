package com.formacionspringboot.apirest.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formacionspringboot.apirest.entity.Usuario;


@Repository
public interface UsuarioDao extends CrudRepository<Usuario,Long>{

	public Usuario findByUsername(String username);
	
	@Query("select u from Usuario u where u.username=?1")
	public Usuario findByUsername2(String username);
}
