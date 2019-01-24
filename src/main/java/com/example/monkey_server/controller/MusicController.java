package com.example.monkey_server.controller;

import com.example.monkey_server.response.ResponseWrapper;
import com.example.monkey_server.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    //    @Autowired
//    MusicDao musicDao;
//
    @Autowired
    MusicService musicService;

    //    @RequestMapping(value = "/search_music")
//    public Music searchMusic(Integer id){
//        return musicDao.searchMusicById(id);
//    }
//
    @RequestMapping(value = "/sleep_before", method = RequestMethod.POST)
    public ResponseWrapper getSleepBeforeMusic(String token, Integer currentPage) {
        return musicService.getSleepBeforeMusic(token, currentPage);
    }
}
