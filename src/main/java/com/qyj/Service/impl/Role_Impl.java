package com.qyj.Service.impl;

import com.qyj.Entity.Role.Role;
import com.qyj.Mapper.RoleMapper;
import com.qyj.Service.Role_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Role_Impl implements Role_Interface {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> findAll() {
        return roleMapper.findAll();
    }

    @Override
    public int findRoleIdByRole(String role) {
        return roleMapper.findRoleIdByRole(role);
    }

    @Override
    public void insert(String role) {
        roleMapper.insert(role);
    }

    @Override
    public void delete(int roleId) {
        roleMapper.delete(roleId);
    }

    @Override
    public void update(Role role) {
        roleMapper.update(role);
    }
}
