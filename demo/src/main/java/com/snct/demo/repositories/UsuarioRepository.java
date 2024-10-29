package com.snct.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snct.demo.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
