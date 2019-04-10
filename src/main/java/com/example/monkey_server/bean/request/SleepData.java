package com.example.monkey_server.bean.request;

import java.io.Serializable;
import java.util.List;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/4/10 10:43
 */
public class SleepData implements Serializable {

    private long start_time;
    private long end_time;
    private int unLockTimes;
    private List<TurnData> turns;

    public long getStart_time() {
        return start_time;
    }

    public void setStart_time(long start_time) {
        this.start_time = start_time;
    }

    public long getEnd_time() {
        return end_time;
    }

    public void setEnd_time(long end_time) {
        this.end_time = end_time;
    }

    public int getUnLockTimes() {
        return unLockTimes;
    }

    public void setUnLockTimes(int unLockTimes) {
        this.unLockTimes = unLockTimes;
    }

    public List<TurnData> getTurns() {
        return turns;
    }

    public void setTurns(List<TurnData> turns) {
        this.turns = turns;
    }
}
