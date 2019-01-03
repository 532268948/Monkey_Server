package com.example.monkey_server.controller;

import com.example.monkey_server.dao.UserDao;
import com.example.monkey_server.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 叶天华
 * @project Monkey_Server
 * @date 2019/1/3 21:01
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/login")
    public List<User> login() {
        return userDao.selectUserByName("15869107730");
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "hello world!!";
    }
}
