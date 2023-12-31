package com.error404.errorfoodapi.di.service.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.error404.errorfoodapi.di.service.events.ClienteAtivadoEvent;

@Component
public class NotificacaoServce {
    private static String message;

    @EventListener
    public String ClienteAtivadoEventListener(ClienteAtivadoEvent clienteAtivadoEvent){

        this.message =  "cliente "+ clienteAtivadoEvent.getPessoa( ).getNome() + " foi Ativado com sucesso";

 //       System.out.println(message);
        return message;

    }

    public static String getMessage() {
        return message;
    }
    
    
}
