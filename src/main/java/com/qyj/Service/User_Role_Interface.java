package com.qyj.Service;

import com.qyj.Entity.Role.User_Role;
import com.qyj.Entity.Role.User_Role_Update;

import java.util.List;

public interface User_Role_Interface {

    /**
     * 根据用户ID,查找其角色
     * @param userId 用户ID
     * @return 用户的角色:role
     */
    List<String> findByUserId(int userId);

    /**
     * 根据用户ID,角色ID,删除指定用户的指定角色
     * @param user_role 用户ID:userId,角色ID:roleID
     */
    void deleteByUserIdRoleId(User_Role user_role);

    /**
     * 根据用户ID,角色ID,为指定用户增加指定角色
     * @param user_role 用户ID:userId,角色ID:roleId
     */
    void insertByUserIdRoleId(User_Role user_role);

    /**
     * 根据用户ID,角色ID,新角色ID,更新指定用户的指定角色为其他角色
     * @param user_role_update 用户ID:userId,角色ID:roleId,新角色ID:newRoleId
     */
    void updateByUserIdRoleId(User_Role_Update user_role_update);
}
