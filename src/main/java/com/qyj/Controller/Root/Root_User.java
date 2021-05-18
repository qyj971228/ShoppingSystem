package com.qyj.Controller.Root;

import com.qyj.Entity.User;
import com.qyj.Service.impl.User_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * passed test
 */

@RestController
@RequestMapping("/root/user")
public class Root_User {

    @Autowired
    User_Impl user_impl;

    @RequestMapping("/insert")
    public void insert(User user){
        user_impl.insert(user);
    }

    @RequestMapping("/update")
    public void update(User user){
        user_impl.update(user);
    }

    @RequestMapping("/delete")
    public void delete(int userId){
        user_impl.delete(userId);
    }

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return user_impl.findAll();
    }

    @RequestMapping("/findById")
    public User findById(int userId){
        return user_impl.findById(userId);
    }

    @RequestMapping("/findByUsername")
    public User findByUsername(String username){
        return user_impl.findByUsername(username);
    }

    @RequestMapping("/findByNickname")
    public User findByNickname(String nickname){
        return user_impl.findByNickname(nickname);
    }

    @RequestMapping("/findByPassword")
    public User findByPassword(String password){
        return user_impl.findByPassword(password);
    }

    @RequestMapping("/findByMobile")
    public User findByMobile(String mobile){
        return user_impl.findByMobile(mobile);
    }

    @RequestMapping("/findByEmail")
    public User findByEmail(String email){
        return user_impl.findByEmail(email);
    }

    @RequestMapping("/findByAddress")
    public User findByAddress(String address){
        return user_impl.findByAddress(address);
    }


}
