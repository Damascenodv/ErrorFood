package com.error404.errorfoodapi.di.notificacao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

import com.error404.errorfoodapi.di.modelo.enums.NivelUrgencia;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier

public @interface TipoNotificador {
    NivelUrgencia value();
}
