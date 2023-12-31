package com.error404.errorfoodapi.di.dao.interfaces;

import java.util.List;

public interface Crudinterface<T> {
    public List<T> getAll();

    public List<T> getAllbyPK(T obj);

    public T insert(T obj);
}
