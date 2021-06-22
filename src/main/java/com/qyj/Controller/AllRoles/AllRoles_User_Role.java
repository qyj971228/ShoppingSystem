package com.qyj.Controller.AllRoles;

import com.qyj.Service.impl.User_Role_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/allRoles/user_role")
public class AllRoles_User_Role {

    @Autowired
    User_Role_Impl user_role_impl;

    @RequestMapping("/findByUserId")
    public List<String> findByUserId(int userId){
        return user_role_impl.findByUserId(userId);
    }
}
