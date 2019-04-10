package com.example.monkey_server.util;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/1/23 13:43
 */
public class Constant {
    public static final Long TOKEN_DEAD_TIME = 60 * 60 * 24 * 30 * 1000L;
    public static final int MUSIC_BEFORE_PAGE_SIZE = 5;

    public static class HttpCode {
        public static final Integer SUCCESS = 200;
        public static final Integer SUCCESS_WITHOUT_DATA = 201;
        public static final Integer FALSE = 300;
        public static final Integer UN_KNOW_ERROR = 301;
        public static final Integer WITHOUT_LOGIN = 401;
        public static final Integer WITHOUT_REGISTER = 402;
    }

    public static class HttpMessage {
        public static final String MESSAGE_WITHOUT_LOGIN = "用户未登录";
        public static final String MESSAGE_WITHOUT_REGISTER = "用户未注册";
        public static final String MESSAGE_DATA_EXCEPTION = "数据异常";
        public static final String MESSAGE_NAME_EMPTY = "账号不能为空";
        public static final String MESSAGE_PASSWORD_EMPTY = "密码不能为空";
        public static final String MESSAGE_UN_KNOW_ERROR = "未知错误";
        public static final String MESSAGE_SUCCESS_WITHOUT_DATA = "没有更多数据了";
    }

    public static class TokenStatus{
        public static final int TOKEN_UN_LOGIN=1;
        public static final int TOKEN_UN_REGISTER=2;
        public static final int TOKEN_LOGIN=3;
        public static final int TOKEN_UN_KNOW_ERROR=4;
    }
}
