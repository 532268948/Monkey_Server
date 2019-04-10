package com.example.monkey_server.bean.request;

import java.io.Serializable;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/4/10 10:43
 */
public class TurnData implements Serializable {
    long time;
    int level;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
