package com.example.monkey_server.service;

import com.example.monkey_server.response.ResponseWrapper;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/1/23 15:41
 */
public interface MusicService {
    /**
     * 睡前小曲
     *
     * @param token
     * @param currentPage 当前页
     * @return
     */
    ResponseWrapper getSleepBeforeMusic(String token, Integer currentPage);
}
