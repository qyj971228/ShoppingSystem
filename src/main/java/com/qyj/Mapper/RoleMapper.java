package com.qyj.Mapper;

import com.qyj.Entity.Role.Role;

import java.util.List;

/**
 * 表roles相关
 */
public interface RoleMapper {

    /**
     * 查找所有角色
     * @return 所有角色(roleID,role)
     */
    List<Role> findAll();

    /**
     * 根据角色名查找角色ID
     * @param role 角色名
     * @return 角色ID
     */
    int findRoleIdByRole(String role);

    /**
     * 添加新的角色名
     * @param role 角色名
     */
    void insert(String role);

    /**
     * 根据角色ID,删除角色
     * @param roleId 角色ID
     */
    void delete(int roleId);

    /**
     * 根据角色ID,角色名,更新指定角色ID的角色名
     * @param role 角色ID:roleId,角色:role
     */
    void update(Role role);


}
