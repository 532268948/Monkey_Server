package com.example.monkey_server.dao;

import com.example.monkey_server.bean.response.UserSleepBean;
import com.example.monkey_server.entity.Sleep;
import com.example.monkey_server.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.Date;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/4/2 12:18
 */

@Mapper
@Repository
public interface SleepDao {

    /**
     * 获取用户的所有睡眠数据
     * @param id
     * @return
     */
    UserSleepBean getSleepList(Integer id);

    int insertSleepData(Sleep sleep);
}
