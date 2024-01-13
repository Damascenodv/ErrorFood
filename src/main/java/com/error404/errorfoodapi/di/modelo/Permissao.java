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
@Table(name = "tb_per_permissao")
public class Permissao {

    @EqualsAndHashCode.Include
    @Id
    @Column(name = "per_codigo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    
    @Column(name = "per_nome", nullable = false)
    private String nome;

    @Column(name = "per_descricao", nullable = false)
    private String descricao;
}
