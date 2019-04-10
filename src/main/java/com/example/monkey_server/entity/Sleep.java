package com.example.monkey_server.entity;


import java.util.Date;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/4/2 12:20
 */
public class Sleep extends BaseEntity {
    private User user;
    private Long start_time;
    private Long end_time;
    private String detail;
    private Integer grade;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
