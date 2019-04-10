package com.example.monkey_server.controller;

import com.example.monkey_server.bean.request.SleepData;
import com.example.monkey_server.response.ResponseWrapper;
import com.example.monkey_server.service.SleepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/4/2 13:23
 */
@RestController
@RequestMapping(value = "/sleep")
public class SleepController {
    @Autowired
    SleepService sleepService;

    @RequestMapping(value = "/user_all_sleep_data", method = RequestMethod.POST)
    public ResponseWrapper getAllSleepData(String token) {
        return sleepService.getUserSleepData(token);
    }

    @RequestMapping(value = "/send_sleep_data",method = RequestMethod.POST)
    public ResponseWrapper receiveSleepData(String token,@RequestBody SleepData sleepData){
        return sleepService.analysisSleepData(token,sleepData);
    }
}
