package com.error404.errorfoodapi.di.dao.jpql;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class BaseJpqlDao {
    @PersistenceContext
    protected EntityManager manager;

}
