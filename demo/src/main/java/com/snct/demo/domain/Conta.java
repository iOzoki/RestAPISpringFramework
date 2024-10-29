package com.snct.demo.domain;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "tb_usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Conta {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String numero;
    private String endereco;
    @Column(precision=10, scale=2)
    private BigDecimal saldo;

}
