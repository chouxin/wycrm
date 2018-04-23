package com.xinchao.wycrmserivce.project.service.impl;

import com.xinchao.wycrmserivce.project.entity.User;
import com.xinchao.wycrmserivce.project.mapper.UserMapper;
import com.xinchao.wycrmserivce.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public int updateUser(Integer id,User user) {
        User u = userMapper.findUserById(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        return userMapper.updateUser(u);
    }

    @Override
    public int deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }
}
