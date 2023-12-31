package com.error404.errorfoodapi.di.dao.jpql;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.error404.errorfoodapi.di.dao.interfaces.Crudinterface;
import com.error404.errorfoodapi.di.modelo.Cozinha;
import com.error404.errorfoodapi.di.modelo.Pessoa;


@Component
public class PessoaJpqlDao extends BaseJpqlDao implements Crudinterface<Pessoa> {

    @Override
    public List<Pessoa> getAll() {
        return manager.createQuery("from Pessoa", Pessoa.class).getResultList();
   
    }

    @Override
    public Pessoa getAllbyPK(long codigo) {
        return manager.find(Pessoa.class, codigo);
    }

    @Override
    @Transactional
    public Pessoa insert(Pessoa obj) {
        return manager.merge(obj);
    }

    @Override
    @Transactional
    public Pessoa update(long codigo, Pessoa obj) {
        Pessoa pessoa  = getAllbyPK(codigo);
        return pessoa;
    }

    @Override
    @Transactional
    public void delete(Pessoa obj) {
        manager.remove(obj);
    }
    
}
