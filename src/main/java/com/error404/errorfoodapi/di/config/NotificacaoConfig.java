package com.error404.errorfoodapi.di.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.error404.errorfoodapi.di.notificacao.Notification;
import com.error404.errorfoodapi.di.notificacao.NotificadorEmail;
import com.error404.errorfoodapi.di.service.AtivacaoClienteService;

//@Configuration
public class NotificacaoConfig {
    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.errorEmailService.com"); 
        notificador.setCaixaAlta(false);
        return notificador;
    }

}
