package com.example.monkey_server.service;

import com.example.monkey_server.entity.User;
import com.example.monkey_server.response.ResponseWrapper;

import java.util.List;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/1/12 16:06
 */
public interface UserService {

    ResponseWrapper login(String name, String password);

    ResponseWrapper getUserInformation(String token);

}
