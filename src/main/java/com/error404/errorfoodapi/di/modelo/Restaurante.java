package com.error404.errorfoodapi.di.modelo;

import java.math.BigDecimal;

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
@Table(name = "tb_res_restaurante")
public class Restaurante {
    
    @EqualsAndHashCode.Include
    @Id
    @Column(name = "res_codigo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @EqualsAndHashCode.Include
    @Column(name = "res_nome")
    private String nome;

    @Column(name = "res_taxa_frete")
    private BigDecimal taxaFrete;



    

    
}
