package com.example.monkey_server.dao;

import com.example.monkey_server.entity.Music;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

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
     *
     * @param id
     * @return
     */
    Music searchMusicById(int id);

    /**
     * 获取睡前小曲列表
     *
     * @param currentSize
     * @param pageSize
     * @return
     */
    List<Music> getSleepBeforeMusic(@Param("currentSize") int currentSize, @Param("pageSize") int pageSize);
}
