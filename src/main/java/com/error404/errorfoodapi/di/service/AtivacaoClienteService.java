package com.error404.errorfoodapi.di.service;

import org.springframework.stereotype.Component;

import com.error404.errorfoodapi.di.modelo.Cliente;
import com.error404.errorfoodapi.di.notificacao.Notificador;


@Component
public class AtivacaoClienteService {

	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService: " + notificador);
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
