package com.error404.errorfoodapi.di.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_fpg_forma_pagamento")
public class FormaPagamento {
    
    @EqualsAndHashCode.Include
    @Id
    @Column(name = "fpg_codigo")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long fpgCodigo;

    @Column(name = "fpg_descricao", nullable = false)
    private String fpgDescricao;
}
