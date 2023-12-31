package com.error404.errorfoodapi.di.notificacao;

import com.error404.errorfoodapi.di.modelo.Pessoa;

public interface Notificador {

	void notificar(Pessoa cliente, String mensagem);

}