package com.xinchao.wycrmserivce.project.mapper;

import com.xinchao.wycrmserivce.project.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();
    int addUser(User user);
    User findUserById(Integer id);
    int updateUser(User user);
    int deleteUserById(Integer id);
}
