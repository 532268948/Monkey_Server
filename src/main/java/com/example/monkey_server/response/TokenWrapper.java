package com.example.monkey_server.response;

import com.example.monkey_server.util.Constant;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/4/2 13:03
 */
public class TokenWrapper {
    /**
     * token检查情况 1未登录 2未注册 3已登录 4未知情况
     */
    private Integer code;
    /**
     * 若查询成功，返回用户id
     */
    private Integer id;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TokenWrapper un_login() {
        this.code = Constant.TokenStatus.TOKEN_UN_LOGIN;
        this.id = null;
        return this;
    }

    public TokenWrapper un_register() {
        this.code = Constant.TokenStatus.TOKEN_UN_REGISTER;
        this.id = null;
        return this;
    }

    public TokenWrapper login(Integer id) {
        this.code = Constant.TokenStatus.TOKEN_LOGIN;
        this.id = id;
        return this;
    }
}
