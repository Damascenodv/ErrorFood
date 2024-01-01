package com.error404.errorfoodapi.di.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_coz_cozinha")
public class Cozinha {
    @EqualsAndHashCode.Include
    @Id
    @Column(name = "coz_codigo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "coz_nome", nullable = false)
    private String nome;

   

    
    
}
