package com.zjc.edu.Service;

import com.zjc.edu.model.User;

public interface IUserService extends BaseService<User> {
    public User login(String username,String password);
}
