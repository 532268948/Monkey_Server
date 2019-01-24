package com.example.monkey_server.service.impl;

import com.example.monkey_server.dao.MusicDao;
import com.example.monkey_server.response.ResponseWrapper;
import com.example.monkey_server.service.MusicService;
import com.example.monkey_server.util.Constant;
import com.example.monkey_server.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/1/23 15:42
 */
@Service("musicService")
public class MusicServiceImpl implements MusicService {

    @Autowired
    MusicDao musicDao;

    @Override
    public ResponseWrapper getSleepBeforeMusic(String token, Integer currentPage) {

        List list = musicDao.getSleepBeforeMusic(currentPage * Constant.MUSIC_BEFORE_PAGE_SIZE, Constant.MUSIC_BEFORE_PAGE_SIZE);
        if (list != null && list.size() != 0) {
            return ResponseUtil.getDataSuccess(list);
        } else {
            return ResponseUtil.getDataSuccessWithoutData();
        }
    }

}
