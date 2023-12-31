package com.error404.errorfoodapi.di.dao.jpql;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.error404.errorfoodapi.di.dao.interfaces.Crudinterface;
import com.error404.errorfoodapi.di.modelo.Restaurante;

@Component
public class RestauranteJpqlDao extends BaseJpqlDao implements  Crudinterface<Restaurante> {
    

    @Override
    public List<Restaurante> getAll() {
       TypedQuery query = manager.createQuery("from restaurante", Restaurante.class);
       return query.getResultList();
    }

    @Override
    public Restaurante getAllbyPK(long codigo) {
        return manager.find(Restaurante.class, codigo);
    }

    @Override
    public Restaurante insert(Restaurante obj) {
        return manager.merge(obj);
    }

    @Override
    public Restaurante update(long id, Restaurante restaurante) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Restaurante obj) {
          manager.remove(obj);
    }


}
