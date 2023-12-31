package com.error404.errorfoodapi.di.service.events;

import org.springframework.stereotype.Component;

import com.error404.errorfoodapi.di.modelo.Pessoa;
import com.error404.errorfoodapi.di.notificacao.Notificador;

public class ClienteAtivadoEvent {
    private Pessoa cliente;

    public ClienteAtivadoEvent(Pessoa cliente,Notificador notificador) {
        this.cliente = cliente;
        if (notificador != null) {
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		}else{
			System.out.println("não existe notificador mas cliente foi aativado");
		}
    }

    public Pessoa getPessoa( ) {
        return cliente;
    }
    
    
}
