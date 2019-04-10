package com.example.monkey_server.bean.response;


import sun.util.calendar.BaseCalendar;

import java.sql.Timestamp;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/4/2 14:42
 */
public class SleepBean {
    private Integer id;
    private Integer grade;
    private Long start_time;
    private Long end_time;
    private String detail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Long getStart_time() {
        return start_time;
    }

    public void setStart_time(Long start_time) {
        this.start_time = start_time;
    }

    public Long getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Long end_time) {
        this.end_time = end_time;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
