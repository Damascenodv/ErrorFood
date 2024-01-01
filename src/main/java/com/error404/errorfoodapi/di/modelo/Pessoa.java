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
@EqualsAndHashCode(onlyExplicitlyIncluded =  true)
@Entity
@Table(name = "tb_pes_pessoa")
public class Pessoa {
    
	@EqualsAndHashCode.Include
	@Id
	@Column(name = "pes_codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@Column(name = "pes_cpf_cnpj", length =12)
	private String cpfCnpj; 

	@EqualsAndHashCode.Include
	@Column(name = "pes_nome")
	private String nome;
	
	@Column(name =  "pes_email")
	private String email;
	
	@Column(name = "pes_telefone")
	private String telefone;
	
	@Column(name = "pes_usuario_ativo", columnDefinition = "BOOLEAN DEFAULT FALSE", nullable = false)
	private boolean usuaioAtivo = false;

	public Pessoa(){

	}
	public Pessoa(String cpfConpj ,String nome, String email, String telefone) {
		this.cpfCnpj = cpfConpj;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public void ativar() {
		this.usuaioAtivo = true;
	}

}
