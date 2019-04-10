package com.example.monkey_server.service.impl;

import com.example.monkey_server.dao.RedisDao;
import com.example.monkey_server.dao.UserDao;
import com.example.monkey_server.response.ResponseWrapper;
import com.example.monkey_server.service.UserService;
import com.example.monkey_server.util.Constant;
import com.example.monkey_server.util.ResponseUtil;
import com.example.monkey_server.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/1/12 16:05
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    RedisDao redisDao;
    @Autowired
    UserDao userDao;

    @Override
    public ResponseWrapper login(String name, String password) {

        if (name == null && name.isEmpty()) {
            return ResponseUtil.getDataFalse(Constant.HttpMessage.MESSAGE_NAME_EMPTY);
        }

        if (password == null && password.isEmpty()) {
            return ResponseUtil.getDataFalse(Constant.HttpMessage.MESSAGE_PASSWORD_EMPTY);
        }

        Map<String, Object> map = userDao.selectUserByNameAndPassword(name, password);
        if (map == null && map.isEmpty()) {
            return ResponseUtil.withoutRegister();
        }

        Long userId = (Long) map.get("id");
        String token = TokenUtil.getToken(userId);
        redisDao.set(userId.toString(), token, Constant.TOKEN_DEAD_TIME);
        map.put("token", token);
        return ResponseUtil.getDataSuccess(map);
    }

    @Override
    public ResponseWrapper getUserInformation(String token) {

        if (token == null || token.isEmpty()) {
            return ResponseUtil.withoutLogin();
        }

        String userId = TokenUtil.JudgementToken(token);
        String redisToken = redisDao.get(userId);
        if (redisToken.equals(token)) {
            Map<String, Object> map = userDao.selectUserById(userId);

            if (map == null || map.isEmpty()) {
                return ResponseUtil.withoutRegister();
            }

            return ResponseUtil.getDataSuccess(map);
        } else {
            return ResponseUtil.withoutLogin();
        }
    }
}
