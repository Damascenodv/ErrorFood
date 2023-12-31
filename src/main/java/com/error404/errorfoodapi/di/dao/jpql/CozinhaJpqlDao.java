package com.error404.errorfoodapi.di.dao.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.error404.errorfoodapi.di.dao.interfaces.Crudinterface;
import com.error404.errorfoodapi.di.modelo.Cozinha;

@Component
public class CozinhaJpqlDao implements Crudinterface<Cozinha>{

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cozinha> getAll() {
       TypedQuery query = manager.createQuery("from Cozinha", Cozinha.class);
       return query.getResultList();
    }
    
}
