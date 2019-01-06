package com.example.monkey_server.dao;

import com.example.monkey_server.entity.Music;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/1/6 14:35
 */
@Mapper
@Repository
public interface MusicDao {

    /**
     * 查询音乐
     * @param id
     * @return
     */
    Music searchMusicById(int id);
}
