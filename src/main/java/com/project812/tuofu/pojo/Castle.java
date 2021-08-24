package com.project812.tuofu.pojo;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public class Castle {
    private String mallTypeName;
    private String castleTypeName;
    private String userName;
    private Integer castleId;
    private Integer castleType;
    private Integer mallType;
    private Integer teacherId;
    private Integer groupId;
    private String classTitle;
    private Date startDate;
    private Date endDate;
    private Time startTime;
    private Time endTime;
    private String castleCycle;
    private String fitPerson;
    private Float castlePay;
    private String castleAddress;
    private String imgUrl;
    private String castleDesc;
    private String castleMethod;
    private Timestamp lastModify;
    private Integer signupNum;
    private Integer collectNum;
    private Integer commentNum;
    private String status;

    public String getMallTypeName() {
        return mallTypeName;
    }

    public void setMallTypeName(String mallTypeName) {
        this.mallTypeName = mallTypeName;
    }

    public String getCastleTypeName() {
        return castleTypeName;
    }

    public void setCastleTypeName(String castleTypeName) {
        this.castleTypeName = castleTypeName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getCastleId() {
        return castleId;
    }

    public void setCastleId(Integer castleId) {
        this.castleId = castleId;
    }

    public Integer getCastleType() {
        return castleType;
    }

    public void setCastleType(Integer castleType) {
        this.castleType = castleType;
    }

    public Integer getMallType() {
        return mallType;
    }

    public void setMallType(Integer mallType) {
        this.mallType = mallType;
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

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public String getCastleCycle() {
        return castleCycle;
    }

    public void setCastleCycle(String castleCycle) {
        this.castleCycle = castleCycle;
    }

    public String getFitPerson() {
        return fitPerson;
    }

    public void setFitPerson(String fitPerson) {
        this.fitPerson = fitPerson;
    }

    public Float getCastlePay() {
        return castlePay;
    }

    public void setCastlePay(Float castlePay) {
        this.castlePay = castlePay;
    }

    public String getCastleAddress() {
        return castleAddress;
    }

    public void setCastleAddress(String castleAddress) {
        this.castleAddress = castleAddress;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCastleDesc() {
        return castleDesc;
    }

    public void setCastleDesc(String castleDesc) {
        this.castleDesc = castleDesc;
    }

    public String getCastleMethod() {
        return castleMethod;
    }

    public void setCastleMethod(String castleMethod) {
        this.castleMethod = castleMethod;
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

    public Integer getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(Integer collectNum) {
        this.collectNum = collectNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Castle() {
        super();
    }

    public Castle(String mallTypeName, String castleTypeName, String userName, Integer castleId, Integer castleType, Integer mallType, Integer teacherId, Integer groupId, String classTitle, Date startDate, Date endDate, Time startTime, Time endTime, String castleCycle, String fitPerson, Float castlePay, String castleAddress, String imgUrl, String castleDesc, String castleMethod, Timestamp lastModify, Integer signupNum, Integer collectNum, Integer commentNum, String status) {
        this.mallTypeName = mallTypeName;
        this.castleTypeName = castleTypeName;
        this.userName = userName;
        this.castleId = castleId;
        this.castleType = castleType;
        this.mallType = mallType;
        this.teacherId = teacherId;
        this.groupId = groupId;
        this.classTitle = classTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.castleCycle = castleCycle;
        this.fitPerson = fitPerson;
        this.castlePay = castlePay;
        this.castleAddress = castleAddress;
        this.imgUrl = imgUrl;
        this.castleDesc = castleDesc;
        this.castleMethod = castleMethod;
        this.lastModify = lastModify;
        this.signupNum = signupNum;
        this.collectNum = collectNum;
        this.commentNum = commentNum;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Castle{" +
                "mallTypeName='" + mallTypeName + '\'' +
                ", castleTypeName='" + castleTypeName + '\'' +
                ", userName='" + userName + '\'' +
                ", castleId=" + castleId +
                ", castleType=" + castleType +
                ", mallType=" + mallType +
                ", teacherId=" + teacherId +
                ", groupId=" + groupId +
                ", classTitle='" + classTitle + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", castleCycle='" + castleCycle + '\'' +
                ", fitPerson='" + fitPerson + '\'' +
                ", castlePay=" + castlePay +
                ", castleAddress='" + castleAddress + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", castleDesc='" + castleDesc + '\'' +
                ", castleMethod='" + castleMethod + '\'' +
                ", lastModify=" + lastModify +
                ", signupNum=" + signupNum +
                ", collectNum=" + collectNum +
                ", commentNum=" + commentNum +
                ", status='" + status + '\'' +
                '}';
    }
}