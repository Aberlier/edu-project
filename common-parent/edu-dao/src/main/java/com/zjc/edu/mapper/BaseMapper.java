package com.zjc.edu.mapper;

import com.zjc.edu.model.User;

public interface BaseMapper<T> {
    public T findById(Integer id);

    public T findByUUId(String uuid);

    public T findAll();

    public void inser(T t);

    public void deleteById(Integer id);

    public void deleteByUUId(String uuid);

    public void update(T t);
}
