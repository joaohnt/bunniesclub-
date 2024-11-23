package com.joaozada.bunniesclub.resources;

import com.joaozada.bunniesclub.entities.Membro;
import com.joaozada.bunniesclub.services.MembroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/membros")
public class MembroResource {

    @Autowired
    private MembroService service;

    @GetMapping
    public ResponseEntity<List<Membro>> findAll() {
        List<Membro> membros = service.findAll();
        return ResponseEntity.ok().body(membros);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Membro> findById(@PathVariable Long id) {
        Membro membro = service.findById(id);
        return ResponseEntity.ok().body(membro);
    }
}
