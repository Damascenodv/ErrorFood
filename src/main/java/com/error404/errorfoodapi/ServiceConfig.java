package com.error404.errorfoodapi;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.error404.errorfoodapi.di.notificacao.Notificador;
import com.error404.errorfoodapi.di.notificacao.NotificadorEmail;
import com.error404.errorfoodapi.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {

    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador){
        return new AtivacaoClienteService(notificador);
    }
}
