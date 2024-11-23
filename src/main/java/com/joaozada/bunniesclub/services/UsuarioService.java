package com.joaozada.bunniesclub.services;

import com.joaozada.bunniesclub.entities.Membro;
import com.joaozada.bunniesclub.entities.Usuario;
import com.joaozada.bunniesclub.repositories.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepo repo;

    public List<Usuario> findAll() {
        return repo.findAll();
    }

    public Usuario findById(Long id) {
        Optional<Usuario> user = repo.findById(id);
        return user.orElse(null);
    }
}
