package com.example.api.services;

import java.util.ArrayList;

import com.example.api.models.UsuarioModel;
import com.example.api.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServices {
  @Autowired
  UsuarioRepository usuarioRepository;

  public ArrayList<UsuarioModel> obtenerUsuarios() {
    return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
  }

  public UsuarioModel guardarUsuario(UsuarioModel usuario) {
    return usuarioRepository.save(usuario);
  }
}
