package com.example.monkey_server.entity;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/1/3 20:59
 */
public class User {
    private Integer Id;
    private String name;
    private String password;
    private String nickName;
    private String phone;
    private Integer gender;
    private String head;
    private String token;
    private Long deadTime;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getDeadTime() {
        return deadTime;
    }

    public void setDeadTime(Long deadTime) {
        this.deadTime = deadTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ",name=" + name +
                ",password=" + password +
                ",nickName=" + nickName +
                ",phone=" + phone +
                ",gender=" + gender +
                ",head=" + head +
                ",token=" + token +
                ",deadTime=" + deadTime +
                "}";
    }
}
