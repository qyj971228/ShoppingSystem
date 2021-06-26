package com.qyj.Service.impl;

import com.qyj.Entity.Role.User_Role;
import com.qyj.Entity.Role.User_Role_Update;
import com.qyj.Entity.UserAndRole;
import com.qyj.Mapper.User_RoleMapper;
import com.qyj.Service.User_Role_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User_Role_Impl implements User_Role_Interface {

    @Autowired
    User_RoleMapper user_roleMapper;

    @Override
    public List<UserAndRole> findAll() {
        return user_roleMapper.findAll();
    }

    @Override
    public List<String> findByUserId(int userId) {
        return user_roleMapper.findByUserId(userId);
    }

    @Override
    public void deleteByUserIdRoleId(User_Role user_role) {
        user_roleMapper.deleteByUserIdRoleId(user_role);
    }

    @Override
    public void insertByUserIdRoleId(User_Role user_role) {
        user_roleMapper.insertByUserIdRoleId(user_role);
    }

    @Override
    public void updateByUserIdRoleId(User_Role_Update user_role_update) {
        user_roleMapper.updateByUserIdRoleId(user_role_update);
    }
}
