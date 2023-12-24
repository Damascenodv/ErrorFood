package com.error404.errorfoodapi.di.notificacao;

import org.springframework.stereotype.Component;

import com.error404.errorfoodapi.di.modelo.Cliente;


public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSmtp;

	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("NotificadorEmail");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta){
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("Notificando %s através do e-mail usando SMTP %s %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), hostServidorSmtp, mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
}
