package com.zjc.edu.Service;

public interface BaseService<T> {
    public T findById(Integer id);

    public T findByUUId(String uuid);

    public T findAll();

    public void inser(T t);

    public void deleteById(Integer id);

    public void deleteByUUId(String uuid);

    public void update(T t);
}
