package com.joaozada.bunniesclub.services;

import com.joaozada.bunniesclub.entities.Membro;
import com.joaozada.bunniesclub.repositories.MembroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembroService {

    @Autowired
    private MembroRepo repo;

    public List<Membro> findAll() {
        return repo.findAll();
    }

    public Membro findById(Long id) {
        Optional<Membro> membro = repo.findById(id);
        return membro.orElse(null);
    }
}
