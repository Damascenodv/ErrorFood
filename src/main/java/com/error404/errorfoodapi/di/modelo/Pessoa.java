package com.error404.errorfoodapi.di.modelo;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pes_pessoa")
public class Pessoa {
    @Id
	@Column(name = "pes_codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	@Column(name = "pes_cpf_cnpj", length =12)
	private String cpfCnpj; 
	@Column(name = "pes_nome")
	private String nome;
	@Column(name =  "pes_email")
	private String email;
	@Column(name = "pes_telefone")
	private String telefone;
	@Column(name = "pes_usuario_ativo")
	private boolean usuaioAtivo = false;

	public Pessoa(){

	}
	public Pessoa(String cpfConpj ,String nome, String email, String telefone) {
		this.cpfCnpj = cpfConpj;
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
		return usuaioAtivo;
	}
	
	public void ativar() {
		this.usuaioAtivo = true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigo ^ (codigo >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	


}
