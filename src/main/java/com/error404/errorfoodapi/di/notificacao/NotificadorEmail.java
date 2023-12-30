package com.error404.errorfoodapi.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.error404.errorfoodapi.di.modelo.Cliente;
import com.error404.errorfoodapi.di.modelo.enums.NivelUrgencia;
@TipoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {

	/*@Value("${notificador.email.host-servidor}")
	private String host;


	@Value("${notificador.email.porta-servidor}")
	private Integer porta;*/

	@Autowired
	private NotificacaPropreties propreties;


		
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("Host: "+propreties.getHostServidor());
		System.out.println("Porta: "+ propreties.getPortaServidor());

		System.out.printf("Notificando %s através do e-mail  %s: %s\n", 
				cliente.getNome(), cliente.getEmail(),mensagem);
	}


}
