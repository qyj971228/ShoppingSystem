package com.qyj.Controller.AllRoles;

import com.qyj.Entity.User;
import com.qyj.Service.impl.User_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/allRoles/user")
public class AllRoles_User {

    @Autowired
    User_Impl user_impl;

    @RequestMapping("/findById")
    public User findById(int userId){
        return user_impl.findById(userId);
    }

}
