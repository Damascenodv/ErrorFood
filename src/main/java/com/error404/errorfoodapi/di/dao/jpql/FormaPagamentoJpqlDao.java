package com.error404.errorfoodapi.di.dao.jpql;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.error404.errorfoodapi.di.dao.interfaces.Repositorio;
import com.error404.errorfoodapi.di.modelo.FormaPagamento;

@Component
public class FormaPagamentoJpqlDao extends BaseJpqlDao implements Repositorio<FormaPagamento>{


    @Override
    public List<FormaPagamento> getAll() {
        TypedQuery query = manager.createQuery("From FormaPagamento", FormaPagamento.class);
        return  query.getResultList();
    }

    @Override
    public FormaPagamento getAllbyPK(long codigo) {
        return manager.find(FormaPagamento.class, codigo);
    }

    @Override
    @Transactional
    public FormaPagamento insert(FormaPagamento obj) {
        return manager.merge(obj);
    }

    @Override
    @Transactional
    public FormaPagamento update(long codigo, FormaPagamento obj) {
        obj.setFpgCodigo(codigo);
        return manager.merge(obj);
    }

    @Override
    @Transactional
    public void delete(FormaPagamento obj) {
        manager.remove(obj);
    }   
    
}
