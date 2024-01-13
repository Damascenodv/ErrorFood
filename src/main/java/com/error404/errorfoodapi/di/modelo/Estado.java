package com.error404.errorfoodapi.di.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tb_est_estado")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Estado {

    
    @Id
    @Column(name = "est_codigo")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long codigo;
    
    @Column(name ="est_nome", nullable =  false)
    private String nome;

    @Column(name = "est_uf", nullable = false)
    private String uf;


}
