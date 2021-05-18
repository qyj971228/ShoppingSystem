package com.qyj.Controller.Root;

import com.qyj.Entity.Role.User_Role;
import com.qyj.Entity.Role.User_Role_Update;
import com.qyj.Service.impl.User_Role_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * passed test
 */

@RestController
@RequestMapping("/root/userRole")
public class Root_User_Role {

    @Autowired
    User_Role_Impl user_role_impl;

    @RequestMapping("/findByUserId")
    public List<String> findByUserId(int userId){
        return user_role_impl.findByUserId(userId);
    }

    @RequestMapping("/deleteByUserIdRoleId")
    public void deleteById(User_Role user_role){
        user_role_impl.deleteByUserIdRoleId(user_role);
    }

    @RequestMapping("/insertByUserIdRoleId")
    public void insertByUserIdRoleId(User_Role user_role){
        user_role_impl.insertByUserIdRoleId(user_role);
    }

    @RequestMapping("/updateByUserIdRoleId")
    public void updateByUserIdRoleId(User_Role_Update user_role_update){
        user_role_impl.updateByUserIdRoleId(user_role_update);
    }
}
