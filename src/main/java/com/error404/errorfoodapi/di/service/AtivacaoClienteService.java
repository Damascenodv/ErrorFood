package com.error404.errorfoodapi.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.error404.errorfoodapi.di.modelo.Cliente;
import com.error404.errorfoodapi.di.modelo.enums.NivelUrgencia;
import com.error404.errorfoodapi.di.notificacao.Notificador;
import com.error404.errorfoodapi.di.notificacao.TipoNotificador;


@Component
public class AtivacaoClienteService {
	@TipoNotificador(NivelUrgencia.URGENTE)
	@Autowired(required = false)
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		if (notificador != null) {
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		}else{
			System.out.println("não existe notificador mas cliente foi aativado");
		}

	}
	
}
