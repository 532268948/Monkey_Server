package com.example.monkey_server.controller;

import com.example.monkey_server.dao.MusicDao;
import com.example.monkey_server.entity.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/1/6 14:35
 */
@RestController
@RequestMapping(value = "/music")
public class MusicController {

    @Autowired
    MusicDao musicDao;

    @RequestMapping(value = "search_music")
    public Music searchMusic(Integer id){
        return musicDao.searchMusicById(id);
    }
}
