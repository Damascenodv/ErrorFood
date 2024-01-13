package com.error404.errorfoodapi.di.dao.jpql;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.error404.errorfoodapi.di.dao.interfaces.Repositorio;
import com.error404.errorfoodapi.di.modelo.Permissao;



@Component
public class PermissaoJpqlDao extends BaseJpqlDao implements Repositorio<Permissao>{

    @Override
    public List<Permissao> getAll() {
        TypedQuery query =  manager.createQuery("from Permissao",Permissao.class);
        return query.getResultList();
    }

    @Override
    public Permissao getAllbyPK(long codigo) {
        return manager.find(Permissao.class, codigo);
    }

    @Override
    @Transactional
    public Permissao insert(Permissao obj) {
       return manager.merge(obj);
    }

    @Override
    @Transactional
    public Permissao update(long codigo, Permissao obj) {
        obj.setCodigo(codigo);
        return manager.merge(obj);

    }

    @Override
    @Transactional
    public void delete(Permissao obj) {
        manager.remove(obj);
    }
    
}
