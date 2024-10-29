package com.snct.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snct.demo.domain.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long>{

}
