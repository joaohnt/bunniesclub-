package com.joaozada.bunniesclub.resources;

import com.joaozada.bunniesclub.entities.Membro;
import com.joaozada.bunniesclub.entities.Usuario;
import com.joaozada.bunniesclub.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<Usuario>> findAll() {
        List<Usuario> user = service.findAll();
        return ResponseEntity.ok().body(user);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id) {
        Usuario user = service.findById(id);
        return ResponseEntity.ok().body(user);
    }
}
