package com.xinchao.wycrmserivce.project.service;

import com.xinchao.wycrmserivce.project.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {
    List<User> findAll();
    int addUser(User user);
    User findUserById(Integer id);
    int updateUser(Integer id,User user);
    int deleteUserById(Integer id);
}
