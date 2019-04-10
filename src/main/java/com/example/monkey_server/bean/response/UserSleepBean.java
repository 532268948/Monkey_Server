package com.example.monkey_server.bean.response;

import com.example.monkey_server.bean.response.SleepBean;

import java.util.List;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/4/2 14:34
 */
public class UserSleepBean {

    private Integer uid;
    private String nickname;
    private List<SleepBean> sleepBeans;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<SleepBean> getSleepBeans() {
        return sleepBeans;
    }

    public void setSleepBeans(List<SleepBean> sleepBeans) {
        this.sleepBeans = sleepBeans;
    }
}
