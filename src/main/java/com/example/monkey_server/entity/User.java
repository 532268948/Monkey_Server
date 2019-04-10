package com.example.monkey_server.entity;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/1/3 20:59
 */
public class User extends BaseEntity{
    private String name;
    private String password;
    private String nickname;
    private String phone;
    private Integer gender;
    private String head;

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    @Override
    public String toString() {
        return "User{" +
                "Id=" + id +
                ",name=" + name +
                ",password=" + password +
                ",nickName=" + nickname +
                ",phone=" + phone +
                ",gender=" + gender +
                ",head=" + head +
                "}";
    }
}
