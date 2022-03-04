package com.example.api.controllers;

import java.util.ArrayList;

import com.example.api.models.UsuarioModel;
import com.example.api.services.UsuarioServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
  @Autowired
  UsuarioServices usuarioService;

  @GetMapping()
  public ArrayList<UsuarioModel> obtenerUsuarios() {
    return usuarioService.obtenerUsuarios();
  }

  @PostMapping()
  public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
    return this.usuarioService.guardarUsuario(usuario);
  }
}
