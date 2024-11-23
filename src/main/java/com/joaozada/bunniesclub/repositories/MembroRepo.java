package com.joaozada.bunniesclub.repositories;

import com.joaozada.bunniesclub.entities.Membro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembroRepo extends JpaRepository<Membro, Long> {
}
