package com.example.monkey_server.dao;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/1/12 16:20
 */

public interface RedisDao {

    /**
     * 普通缓存获取
     *
     * @param key 键
     * @return 值
     */
    String get(String key);

    /**
     * 普通缓存放入
     *
     * @param key   键
     * @param value 值
     * @return true成功 false失败
     */
    boolean set(String key, String value);

    /**
     * 普通缓存放入并设置时间
     *
     * @param key   键
     * @param value 值
     * @param time  时间(秒) time要大于0 如果time小于等于0 将设置无限期
     * @return true成功 false 失败
     */
    boolean set(String key, String value, long time);
}
