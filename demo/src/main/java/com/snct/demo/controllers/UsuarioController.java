package com.snct.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snct.demo.domain.Conta;
import com.snct.demo.domain.Usuario;
import com.snct.demo.repositories.UsuarioRepository;



@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping()
    public ResponseEntity<?> getMethodName() {
        return ResponseEntity.ok(usuarioRepository.findAll());
    }

    @PostMapping()
    public ResponseEntity<?> postMethodName(@RequestBody UsuarioDTO entity) {
        Conta conta = Conta.builder().build();
        
        Usuario usuario = Usuario.builder()
        .nome(entity.getNome())
        .email(entity.getEmail())
        .cpf(entity.getCPF())
        .conta(conta)
        .build();
        usuarioRepository.save(usuario);
        return ResponseEntity.ok().build();
    }

    
}
