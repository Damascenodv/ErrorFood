package com.error404.errorfoodapi.di.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pes_pessoa")
public class Pessoa {

	private int codigo;
	private String cpfCnpj; 
	private String nome;
	private String email;
	private String telefone;
	private boolean ativo = false;

	public Pessoa(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public boolean isAtivo() {
		return ativo;
	}
	
	public void ativar() {
		this.ativo = true;
	}

}
