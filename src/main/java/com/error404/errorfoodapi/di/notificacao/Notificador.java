package com.error404.errorfoodapi.di.notificacao;

import com.error404.errorfoodapi.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}