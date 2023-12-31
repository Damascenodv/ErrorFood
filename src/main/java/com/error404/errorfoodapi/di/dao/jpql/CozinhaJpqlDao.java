package com.error404.errorfoodapi.di.dao.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

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

    @Override
    public List<Cozinha> getAllbyPK(Cozinha cozinha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllbyPK'");
    }

    @Override
    @Transactional
    public Cozinha insert(Cozinha cozinha) {
        return manager.merge(cozinha);
    }
    


    
}
