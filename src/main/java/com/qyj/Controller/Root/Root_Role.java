package com.qyj.Controller.Root;

import com.qyj.Entity.Role.Role;
import com.qyj.Service.impl.Role_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * passed test
 */

@RestController
@RequestMapping("/root/role")
public class Root_Role {

    @Autowired
    Role_Impl role_impl;

    @RequestMapping("/findAll")
    public List<Role> findAll(){
        return role_impl.findAll();
    }

    @RequestMapping("/insert")
    public void insert(String role){
        role_impl.insert(role);
    }

    @RequestMapping("/delete")
    public void delete(int roleId){
        role_impl.delete(roleId);
    }

    @RequestMapping("/update")
    public void update(Role role){
        role_impl.update(role);
    }

}
