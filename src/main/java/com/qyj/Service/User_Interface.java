package com.qyj.Service;

import com.qyj.Entity.User;

import java.util.List;

public interface User_Interface {

    /**
     * 新增用户信息
     * @param user 用户信息(username,nickname,password,mobile,email,address)
     */
    void insert(User user);

    /**
     * 根据用户ID,更新用户信息
     * @param user 用户ID:userId,用户信息(username,nickname,password,mobile,email,address)
     */
    void update(User user);

    /**
     * 根据用户ID删除用户
     * @param userId 用户ID
     */
    void delete(int userId);

    /**
     * 查找所有用户的全部信息
     * @return 用户信息
     */
    List<User> findAll();

    /**
     * 根据用户ID,查找指定用户的全部信息
     * @param userId 用户ID
     * @return 用户信息
     */
    User findById(int userId);

    /**
     * 根据用户名查找用户信息
     * @param username 用户名
     * @return 用户信息
     */
    User findByUsername(String username);

    /**
     * 根据昵称查找用户信息
     * @param nickname 昵称
     * @return 用户信息
     */
    User findByNickname(String nickname);

    /**
     * 根据密码查找用户信息
     * @param password 密码
     * @return 用户信息
     */
    User findByPassword(String password);

    /**
     * 根据手机查找用户信息
     * @param mobile 手机
     * @return 用户信息
     */
    User findByMobile(String mobile);

    /**
     * 根据电子邮箱查找用户信息
     * @param email 邮箱
     * @return 用户信息
     */
    User findByEmail(String email);

    /**
     * 根据地址查找用户信息
     * @param address 地址
     * @return 用户信息
     */
    User findByAddress(String address);


}
