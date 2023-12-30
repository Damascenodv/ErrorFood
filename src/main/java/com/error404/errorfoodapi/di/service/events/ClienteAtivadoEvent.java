package com.error404.errorfoodapi.di.service.events;

import org.springframework.stereotype.Component;

import com.error404.errorfoodapi.di.modelo.Cliente;

public class ClienteAtivadoEvent {
    private Cliente cliente;

    public ClienteAtivadoEvent(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    
}
