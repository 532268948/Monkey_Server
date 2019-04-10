package com.example.monkey_server.service;

import com.example.monkey_server.dao.RedisDao;
import com.example.monkey_server.dao.UserDao;
import com.example.monkey_server.response.ResponseWrapper;
import com.example.monkey_server.response.TokenWrapper;
import com.example.monkey_server.util.Constant;
import com.example.monkey_server.util.ResponseUtil;
import com.example.monkey_server.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/4/2 12:48
 */
public class BaseServiceImpl {

    private TokenWrapper tokenWrapper = new TokenWrapper();

    @Autowired
    public RedisDao redisDao;
    @Autowired
    public UserDao userDao;

    /**
     * 检查token
     *
     * @param token
     * @return 1未登录 2未注册 3已登录 4未知情况
     */
    protected synchronized TokenWrapper checkToken(String token) {
        if (token == null || token.isEmpty()) {
            return tokenWrapper.un_login();
        }

        String userId = TokenUtil.JudgementToken(token);
        String redisToken = redisDao.get(userId);
        if (redisToken.equals(token)) {
            Map<String, Object> map = userDao.selectUserById(userId);

            if (map == null || map.isEmpty()) {
                return tokenWrapper.un_register();
            }

            return tokenWrapper.login(Integer.valueOf(userId));
        } else {
            return tokenWrapper.un_login();
        }
    }

    protected synchronized ResponseWrapper tokenError(TokenWrapper tokenWrapper) {
        if (tokenWrapper.getCode() == Constant.TokenStatus.TOKEN_UN_LOGIN) {
            return ResponseUtil.withoutLogin();
        } else if (tokenWrapper.getCode() == Constant.TokenStatus.TOKEN_UN_REGISTER) {
            return ResponseUtil.withoutRegister();
        } else if (tokenWrapper.getCode() == Constant.TokenStatus.TOKEN_UN_KNOW_ERROR) {
            return ResponseUtil.UnKnowError();
        }
        return ResponseUtil.UnKnowError();
    }
}
