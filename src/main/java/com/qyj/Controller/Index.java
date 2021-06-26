package com.qyj.Controller;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import com.qyj.Entity.Role.User_Role;
import com.qyj.Entity.User;
import com.qyj.Service.impl.Role_Impl;
import com.qyj.Service.impl.User_Impl;
import com.qyj.Service.impl.User_Role_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/")
public class Index {

    @Autowired
    User_Impl user_impl;

    @Autowired
    Role_Impl role_impl;

    @Autowired
    User_Role_Impl user_role_impl;

    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     * @return 登录失败时返回的saTokenInfo的tokenName中携带了失败信息
     */
    @RequestMapping("/login")
    public SaTokenInfo login(String username, String password){

        User user = user_impl.findByUsername(username);
        try{
            if(password.equals(user.getPassword())){
                StpUtil.setLoginId(user.getUserId());
                return StpUtil.getTokenInfo();
            }else {
                SaTokenInfo saTokenInfo = StpUtil.getTokenInfo();
                saTokenInfo.tokenName = "密码错误";
                return saTokenInfo;
            }
        }catch(NullPointerException npe){
            SaTokenInfo saTokenInfo = StpUtil.getTokenInfo();
            saTokenInfo.tokenName = "用户名错误";
            return saTokenInfo;
        }
    }

    /**
     *
     * @param user 用户信息 String username;String nickname;String password;String mobile;String email;String address;
     * @param role 用户需要被赋予的角色
     * @return
     */
    @RequestMapping("/register")
    public String register(User user, String role){

        try{
            user_impl.insert(user);

            User newUser = user_impl.findByUsername(user.getUsername());

            if(role == "root"){
                return "非法权限操作";
            }else {
                User_Role newUser_Role = new User_Role();
                newUser_Role.setUserId(newUser.getUserId());
                newUser_Role.setRoleId(role_impl.findRoleIdByRole(role));

                user_role_impl.insertByUserIdRoleId(newUser_Role);

                return "注册成功";
            }

        }catch(DataAccessException e){

            //先捕捉为DataAccessException,再获取具体异常,最后通过异常返回具体的信息
            SQLException se = (SQLException)e.getCause();

            if(se.getErrorCode() == 1048){
                return "用户名或密码不能为空";

            }else if(se.getErrorCode() == 1062){
                return "已经存在的用户名";

            }
            return "创建失败";
        }
    }

    /**
     * 注销
     * @return 注销操作信息
     */
    @RequestMapping("/logout")
    public String logout(){

        try{
            StpUtil.logout();
        }catch (Exception e){
            return "注销失败";
        }

        return "注销成功";

    }

}
