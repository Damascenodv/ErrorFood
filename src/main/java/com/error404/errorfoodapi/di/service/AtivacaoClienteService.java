package com.error404.errorfoodapi.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.error404.errorfoodapi.di.modelo.Pessoa;
import com.error404.errorfoodapi.di.modelo.enums.NivelUrgencia;
import com.error404.errorfoodapi.di.notificacao.Notificador;
import com.error404.errorfoodapi.di.notificacao.TipoNotificador;
import com.error404.errorfoodapi.di.service.events.PessoaAtivadoEvent;


@Component
public class AtivacaoClienteService {

    @Autowired
	private  ApplicationEventPublisher eventPublisher;

	public void ativar(Pessoa cliente,Notificador notificador) {
		cliente.ativar();
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente,notificador));

		

	}
	
}
