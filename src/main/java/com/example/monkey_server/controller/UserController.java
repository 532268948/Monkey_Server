package com.example.monkey_server.controller;

import com.example.monkey_server.response.ResponseWrapper;
import com.example.monkey_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 叶天华
 * @project Monkey_Server
 * @date 2019/1/3 21:01
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseWrapper login(String name, String password) {
        return userService.login(name, password);
    }

    @RequestMapping(value = "/information",method = RequestMethod.POST)
    public ResponseWrapper getUserInformation(String token) {
        return userService.getUserInformation(token);
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "hello world!!";
    }
}
