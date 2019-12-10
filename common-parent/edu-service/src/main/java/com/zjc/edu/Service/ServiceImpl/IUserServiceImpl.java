package com.zjc.edu.Service.ServiceImpl;

import com.zjc.edu.Service.BaseService;
import com.zjc.edu.Service.IUserService;
import com.zjc.edu.mapper.UserMapper;
import com.zjc.edu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class IUserServiceImpl extends BaseServiceImpl<User> implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByUUId(String uuid) {
        return null;
    }

    @Override
    public User findAll() {
        return null;
    }

    @Override
    public void inser(User user) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUUId(String uuid) {

    }

    @Override
    public void update(User user) {

    }
}
