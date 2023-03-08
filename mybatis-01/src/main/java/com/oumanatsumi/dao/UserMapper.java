package com.oumanatsumi.dao;

import com.oumanatsumi.pojo.User;

public interface UserMapper {

    //根据id查询用户
    User getUserById(int id);


    // 插入一个用户
    int insertUser(User user);

    // 修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);
}
