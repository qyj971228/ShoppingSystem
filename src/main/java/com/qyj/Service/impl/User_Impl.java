package com.qyj.Service.impl;

import com.qyj.Entity.User;
import com.qyj.Mapper.UserMapper;
import com.qyj.Service.User_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User_Impl implements User_Interface {

    @Autowired
    UserMapper userMapper;

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(int userId) {
        userMapper.delete(userId);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findById(int userId) {
        return userMapper.findById(userId);
    }

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    @Override
    public User findByNickname(String nickname) {
        return userMapper.findByNickname(nickname);
    }

    @Override
    public User findByPassword(String password) {
        return userMapper.findByPassword(password);
    }

    @Override
    public User findByMobile(String mobile) {
        return userMapper.findByMobile(mobile);
    }

    @Override
    public User findByEmail(String email) {
        return userMapper.findByEmail(email);
    }

    @Override
    public User findByAddress(String address) {
        return userMapper.findByAddress(address);
    }
}
