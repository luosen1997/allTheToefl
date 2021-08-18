package com.project812.tuofu.pojo;


import java.util.Date;

public class Actives {

    private Integer activeId;
    private Integer classId;
    private String  activeName;
    private String imgUrl;
    private String activeDesc;
    private String classTitle;
    private String userName;
    private Date createTime;
    private Date startTime;

    public String getClassTitle() {
        return classTitle;
    }

    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Actives(Integer activeId, Integer classId, String activeName, String imgUrl, String activeDesc) {
        this.activeId = activeId;
        this.classId = classId;
        this.activeName = activeName;
        this.imgUrl = imgUrl;
        this.activeDesc = activeDesc;
    }

    public Integer getActiveId() {
        return activeId;
    }

    public void setActiveId(Integer activeId) {
        this.activeId = activeId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getActiveName() {
        return activeName;
    }

    public void setActiveName(String activeName) {
        this.activeName = activeName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getActiveDesc() {
        return activeDesc;
    }

    public void setActiveDesc(String activeDesc) {
        this.activeDesc = activeDesc;
    }

    @Override
    public String toString() {
        return "Activitys{" +
                "activeId=" + activeId +
                ", classId=" + classId +
                ", activeName='" + activeName + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", activeDesc='" + activeDesc + '\'' +
                '}';
    }

    public Actives() {
    }
}
