package com.example.service;

import com.example.entity.Usuario;
import com.example.repository.UsuarioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Transactional
    public void save(Usuario usuario) {
        usuarioRepository.persistAndFlush(usuario);
    }


    public Usuario findByUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }
}
