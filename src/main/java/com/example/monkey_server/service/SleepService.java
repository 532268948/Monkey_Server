package com.example.monkey_server.service;

import com.example.monkey_server.bean.request.SleepData;
import com.example.monkey_server.entity.Sleep;
import com.example.monkey_server.response.ResponseWrapper;

import java.util.List;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/4/2 12:35
 */
public interface SleepService {

    /**
     * 获取用户睡眠数据
     * @param token 用户token
     * @return
     */
    ResponseWrapper getUserSleepData(String token);

    /**
     * 分析用户睡眠数据
     */
    ResponseWrapper analysisSleepData(String token, SleepData sleepData);
}
