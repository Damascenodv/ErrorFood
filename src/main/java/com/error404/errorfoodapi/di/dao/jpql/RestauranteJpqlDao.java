package com.error404.errorfoodapi.di.dao.jpql;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.error404.errorfoodapi.di.dao.interfaces.Repositorio;
import com.error404.errorfoodapi.di.modelo.Restaurante;

@Component
public class RestauranteJpqlDao extends BaseJpqlDao implements  Repositorio<Restaurante> {
    

    @Override
    public List<Restaurante> getAll() {
       TypedQuery query = manager.createQuery("from Restaurante", Restaurante.class);
       return query.getResultList();
    }

    @Override
    public Restaurante getAllbyPK(long codigo) {
        return manager.find(Restaurante.class, codigo);
    }

    @Override
    @Transactional
    public Restaurante insert(Restaurante obj) {
        return manager.merge(obj);
    }

    @Override
    @Transactional
    public Restaurante update(long id, Restaurante restaurante) {
        restaurante.setCodigo(id);
        return manager.merge(restaurante);
    }

    @Override
    @Transactional
    public void delete(Restaurante obj) {
          manager.remove(obj);
    }


}
