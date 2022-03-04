package com.example.api.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.api.models.UsuarioModel;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {

}
