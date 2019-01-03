package com.example.monkey_server.dao;

import com.example.monkey_server.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 叶天华
 * @project Monkey_Server
 * @date 2019/1/3 21:00
 */
@Mapper
@Repository
public interface UserDao {
    List<User> selectUserByName(String name);
}
