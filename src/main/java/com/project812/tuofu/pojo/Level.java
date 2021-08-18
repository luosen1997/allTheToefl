package com.project812.tuofu.pojo;

public class Level {
    private Integer id;
    private String levelName;
    private String levelPay;

    public Level(Integer id, String levelName, String levelPay) {
        this.id = id;
        this.levelName = levelName;
        this.levelPay = levelPay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getLevelPay() {
        return levelPay;
    }

    public void setLevelPay(String levelPay) {
        this.levelPay = levelPay;
    }
}
