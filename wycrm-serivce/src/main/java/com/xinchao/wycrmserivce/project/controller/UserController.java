package com.xinchao.wycrmserivce.project.controller;

import com.xinchao.wycrmserivce.project.entity.User;
import com.xinchao.wycrmserivce.project.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<User> findAll(){
       return userService.findAll();
    }
    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user",required = true, dataType = "User")
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public int addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @ApiOperation(value="根据id获取用户信息", notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "Integer",paramType = "path")
    @RequestMapping(value = "/findUserById/{id}",method = RequestMethod.POST)
    public User findUserById(@PathVariable Integer id){
        return userService.findUserById(id);
    }
    @ApiOperation(value = "更新用户详细信息",notes = "根据url的id来更新user对象")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户id", required = true,dataType = "Integer",paramType = "path"),
            @ApiImplicitParam(name = "user", value = "user对象类", required = true, dataType = "User")
    })
    @RequestMapping(value = "/updateUser/{id}",method = RequestMethod.PUT)
    public int updateUser(@PathVariable Integer id, @RequestBody User user){
        return  userService.updateUser(id,user);
    }
    @ApiOperation(value = "删除用户",notes = "根据用户id删除用户")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Integer",paramType = "path")
    @RequestMapping(value = "/deleteUserById/{id}",method = RequestMethod.DELETE)
    public int deleteUserById(@PathVariable Integer id){
        return  userService.deleteUserById(id);
    }
}
