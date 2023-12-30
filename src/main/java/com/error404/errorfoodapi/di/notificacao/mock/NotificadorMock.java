package com.error404.errorfoodapi.di.notificacao.mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.error404.errorfoodapi.di.modelo.Cliente;
import com.error404.errorfoodapi.di.modelo.enums.NivelUrgencia;
import com.error404.errorfoodapi.di.notificacao.NotificacaPropreties;
import com.error404.errorfoodapi.di.notificacao.Notificador;
import com.error404.errorfoodapi.di.notificacao.TipoNotificador;


@Profile("dev")
@TipoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorMock implements Notificador {
	@Autowired
	private NotificacaPropreties propreties;

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("Host: "+propreties.getHostServidor());
		System.out.println("Porta: "+ propreties.getPortaServidor());

		System.out.printf("Mock: Notificando %s através do e-mail  %s: %s\n", 
				cliente.getNome(), cliente.getEmail(),mensagem);
	}


}
