package com.error404.errorfoodapi.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.error404.errorfoodapi.di.modelo.Pessoa;
import com.error404.errorfoodapi.di.modelo.enums.NivelUrgencia;

@Profile("prod")
@TipoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {

	@Autowired
	private NotificacaPropreties propreties;
		
	@Override
	public void notificar(Pessoa cliente, String mensagem) {
		System.out.println("Host: "+propreties.getHostServidor());
		System.out.println("Porta: "+ propreties.getPortaServidor());

		System.out.printf("Notificando %s através do e-mail  %s: %s\n", 
				cliente.getNome(), cliente.getEmail(),mensagem);
	}


}
