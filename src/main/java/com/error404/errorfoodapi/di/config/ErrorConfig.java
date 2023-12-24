package com.error404.errorfoodapi.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.error404.errorfoodapi.di.notificacao.Notificador;
import com.error404.errorfoodapi.di.notificacao.NotificadorEmail;
import com.error404.errorfoodapi.di.service.AtivacaoClienteService;

//@Configuration
public class ErrorConfig {
    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.errorEmailService.com"); 
        notificador.setCaixaAlta(true);
        return notificador;
    }
    @Bean
    public AtivacaoClienteService ativacaoClienteService(){
        return new AtivacaoClienteService(notificadorEmail());
    }
}
