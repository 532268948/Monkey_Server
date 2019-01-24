package com.example.monkey_server.response;

import org.springframework.context.annotation.Bean;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/1/12 16:44
 */
public class ResponseWrapper {
    /**
     * 状态码 200表示成功
     */
    private Integer code;
    /**
     * 若查询失败，返回错误信息
     */
    private String msg;

    /**
     * 数据
     */
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
