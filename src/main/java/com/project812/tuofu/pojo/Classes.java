package com.project812.tuofu.pojo;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public class Classes {
    private Integer classId;
    private Integer classType;
    private Integer teacherId;
    private Integer groupId;
    private String classTitle;
    private Date startDate;
    private Time startTime;
    private Time endTime;
    private String fitPerson;
    private String imgUrl;
    private String classDesc;
    private String classMethod;
    private String classGuide;
    private Timestamp lastModify;
    private Integer signupNum;
    private String status;
    private String userName;
    private String typeName;

    public Classes() {
        super();
    }

    public Classes(String typeName,String userName,Integer classId, Integer classType, Integer teacherId, Integer groupId, String classTitle, Date startDate, Time startTime, Time endTime, String fitPerson, String imgUrl, String classDesc, String classMethod, String classGuide, Timestamp lastModify, Integer signupNum, String status) {
        this.typeName = typeName;
        this.userName = userName;
        this.classId = classId;
        this.classType = classType;
        this.teacherId = teacherId;
        this.groupId = groupId;
        this.classTitle = classTitle;
        this.startDate = startDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.fitPerson = fitPerson;
        this.imgUrl = imgUrl;
        this.classDesc = classDesc;
        this.classMethod = classMethod;
        this.classGuide = classGuide;
        this.lastModify = lastModify;
        this.signupNum = signupNum;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "classId=" + classId +
                ", classType=" + classType +
                ", teacherId=" + teacherId +
                ", groupId=" + groupId +
                ", classTitle='" + classTitle + '\'' +
                ", startDate=" + startDate +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", fitPerson='" + fitPerson + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", classDesc='" + classDesc + '\'' +
                ", classMethod='" + classMethod + '\'' +
                ", classGuide='" + classGuide + '\'' +
                ", lastModify=" + lastModify +
                ", signupNum=" + signupNum +
                ", status='" + status + '\'' +
                ", userName='" + userName + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getClassType() {
        return classType;
    }

    public void setClassType(Integer classType) {
        this.classType = classType;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
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

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public String getFitPerson() {
        return fitPerson;
    }

    public void setFitPerson(String fitPerson) {
        this.fitPerson = fitPerson;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
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

    public Timestamp getLastModify() {
        return lastModify;
    }

    public void setLastModify(Timestamp lastModify) {
        this.lastModify = lastModify;
    }

    public Integer getSignupNum() {
        return signupNum;
    }

    public void setSignupNum(Integer signupNum) {
        this.signupNum = signupNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
