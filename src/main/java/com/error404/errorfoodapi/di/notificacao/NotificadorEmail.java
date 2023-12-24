package com.error404.errorfoodapi.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.error404.errorfoodapi.di.modelo.Cliente;
import com.error404.errorfoodapi.di.modelo.enums.NivelUrgencia;
@TipoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {
		
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail  %s: %s\n", 
				cliente.getNome(), cliente.getEmail(),mensagem);
	}


}
