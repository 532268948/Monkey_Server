package com.example.monkey_server.util;

import com.example.monkey_server.response.ResponseWrapper;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/1/12 16:59
 */
public class ResponseUtil {

    private static ResponseWrapper response = new ResponseWrapper();

    public static ResponseWrapper getDataSuccess(Object data) {
        response.setCode(Constant.HttpCode.SUCCESS);
        response.setMsg("");
        response.setData(data);
        return response;
    }

    public static ResponseWrapper getDataSuccessWithoutData() {
        response.setCode(Constant.HttpCode.SUCCESS_WITHOUT_DATA);
        response.setMsg(Constant.HttpMessage.MESSAGE_SUCCESS_WITHOUT_DATA);
        response.setData(null);
        return response;
    }

    public static ResponseWrapper getDataFalse(String msg) {
        response.setCode(Constant.HttpCode.FALSE);
        response.setMsg(msg);
        response.setData(null);
        return response;
    }

    public static ResponseWrapper withoutLogin() {
        response.setCode(Constant.HttpCode.WITHOUT_LOGIN);
        response.setMsg(Constant.HttpMessage.MESSAGE_WITHOUT_LOGIN);
        response.setData(null);
        return response;
    }

    public static ResponseWrapper withoutRigster() {
        response.setCode(Constant.HttpCode.WITHOUT_REGISTER);
        response.setMsg(Constant.HttpMessage.MESSAGE_WITHOUT_REGISTER);
        response.setData(null);
        return response;
    }

    public static ResponseWrapper UnKnowError() {
        response.setCode(Constant.HttpCode.UN_KNOW_ERROR);
        response.setMsg(Constant.HttpMessage.MESSAGE_UN_KNOW_ERROR);
        response.setData(null);
        return response;
    }
}
