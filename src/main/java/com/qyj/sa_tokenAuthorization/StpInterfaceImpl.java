package com.qyj.sa_tokenAuthorization;

import cn.dev33.satoken.stp.StpInterface;
import com.qyj.Entity.Role.Role;
import com.qyj.Service.impl.User_Role_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义权限扩展接口
 * 获取当前账号权限码集合 -> 结合数据库获取当前账号的权限码与角色标识
 */

@Component
public class StpInterfaceImpl implements StpInterface {

    @Autowired
    User_Role_Impl user_role_impl;

    /**
     * 返回一个账号所拥有的权限码集合
     */
    @Override
    public List<String> getPermissionList(Object loginId, String loginKey) {
        return null;
    }

    /**
     * 返回一个账号所拥有的角色标识集合
     */
    @Override
    public List<String> getRoleList(Object loginId, String loginKey) {

        // 根据loginId在数据库中获取目标所有角色
        List<String> roles = user_role_impl.findByUserId(Integer.valueOf(loginId.toString()));
        // 返回List
        return roles;
    }
}
