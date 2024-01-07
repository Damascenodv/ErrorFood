package com.error404.errorfoodapi.di.dao.jpql;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.error404.errorfoodapi.di.dao.interfaces.Repositorio;
import com.error404.errorfoodapi.di.modelo.Cozinha;

@Component
public class CozinhaJpqlDao extends BaseJpqlDao implements Repositorio<Cozinha>{


    @Override
    public List<Cozinha> getAll() {
       TypedQuery query = manager.createQuery("from Cozinha", Cozinha.class);
       return query.getResultList();
    }

    @Override
    public Cozinha getAllbyPK(long codigo) {
        return manager.find(Cozinha.class, codigo);
    }

    @Override
    @Transactional
    public Cozinha insert(Cozinha cozinha) {
        return manager.merge(cozinha);
    }

    @Override
    @Transactional  
    public Cozinha update(long id, Cozinha cozinha) {
        cozinha.setCodigo(id);
        return manager.merge(cozinha);
    }

    @Override
    @Transactional
    public void delete(Cozinha obj) {
        manager.remove(obj);
    }


    


    
}
