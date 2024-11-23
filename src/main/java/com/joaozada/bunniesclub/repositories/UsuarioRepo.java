package com.joaozada.bunniesclub.repositories;

import com.joaozada.bunniesclub.entities.Membro;
import com.joaozada.bunniesclub.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}
