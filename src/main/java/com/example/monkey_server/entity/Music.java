package com.example.monkey_server.entity;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/1/6 14:11
 */
public class Music {
    private Integer id;
    private Integer type;
    private String name;
    private String author;
    private String cover;
    private Integer free;
    private Float price;
    private String resource;
    private Long playTimes;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getFree() {
        return free;
    }

    public void setFree(Integer free) {
        this.free = free;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Long getPlayTimes() {
        return playTimes;
    }

    public void setPlayTimes(Long playTimes) {
        this.playTimes = playTimes;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
