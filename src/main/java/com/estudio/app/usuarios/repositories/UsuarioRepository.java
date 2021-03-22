package com.estudio.app.usuarios.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.estudio.app.commons.usuarios.models.entities.Usuario;

@RepositoryRestResource(path="usuarios")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Integer>{

	@RestResource(path="getByName")
	public Usuario findByUsername(@Param("name") String username);
}
