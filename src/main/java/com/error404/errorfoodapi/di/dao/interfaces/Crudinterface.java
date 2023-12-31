package com.error404.errorfoodapi.di.dao.interfaces;

import java.util.List;

public interface Crudinterface<T> {
    public List<T> getAll();

    public T getAllbyPK(long codigo);

    public T insert(T obj);

    public T update (long codigo, T obj);

    public void delete (T obj);
}
