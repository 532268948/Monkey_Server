package com.example.monkey_server.dao;

import com.example.monkey_server.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author 叶天华
 * @project Monkey_Server
 * @date 2019/1/3 21:00
 */
@Mapper
@Repository
public interface UserDao {
    List<User> selectUserByName(String name);

    /**
     * 用户登录返回信息
     *
     * @param name
     * @param password
     * @return
     */
    Map<String, Object> selectUserByNameAndPassword(@Param("name") String name, @Param("password") String password);

    /**
     * 获取用户信息
     *
     * @param id
     * @return
     */
    Map<String, Object> selectUserById(@Param("id") String id);
}
