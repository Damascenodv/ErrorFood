package com.error404.errorfoodapi.di.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "tb_cid_cidade")
public class Cidade {
    @Id
    @Column(name = "cid_codigo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    
    @Column(name =  "cid_nome", nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "est_codigo", nullable = false)
    private Estado estado;
}
