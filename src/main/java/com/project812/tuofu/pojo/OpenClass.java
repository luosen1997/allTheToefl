package com.project812.tuofu.pojo;

import javax.xml.crypto.Data;
import java.util.Date;

public class OpenClass {
    private Integer signUpId;
    private Integer userId;
    private Integer classId;
    private String classTitle;
    private Date startDate;
    private Date startTime;
    private Date endTime;
    private Integer teacherId;
    private String classMethod;
    private String classGuide;
    private String classDesc;
    private Integer signUpNum;
    private String userName;
    private Integer phraseNum;
    private String introduce;

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Override
    public String toString() {
        return "OpenClass{" +
                "signUpId=" + signUpId +
                ", userId=" + userId +
                ", classId=" + classId +
                ", classTitle='" + classTitle + '\'' +
                ", startDate=" + startDate +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", teacherId=" + teacherId +
                ", classMethod='" + classMethod + '\'' +
                ", classGuide='" + classGuide + '\'' +
                ", classDesc='" + classDesc + '\'' +
                ", signUpNum=" + signUpNum +
                ", userName='" + userName + '\'' +
                ", phraseNum=" + phraseNum +
                '}';
    }

    public Integer getPhraseNum() {
        return phraseNum;
    }

    public void setPhraseNum(Integer phraseNum) {
        this.phraseNum = phraseNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public OpenClass() {
    }

    public Integer getSignUpId() {
        return signUpId;
    }

    public void setSignUpId(Integer signUpId) {
        this.signUpId = signUpId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassTitle() {
        return classTitle;
    }

    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getClassMethod() {
        return classMethod;
    }

    public void setClassMethod(String classMethod) {
        this.classMethod = classMethod;
    }

    public String getClassGuide() {
        return classGuide;
    }

    public void setClassGuide(String classGuide) {
        this.classGuide = classGuide;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public Integer getSignUpNum() {
        return signUpNum;
    }

    public void setSignUpNum(Integer signUpNum) {
        this.signUpNum = signUpNum;
    }
}
