package com.project812.tuofu.pojo;

import java.util.Date;

public class Groups {
    private String userName;
    private Integer groupId;
    private Integer groupType;
    private String groupName;
    private String imgUrl;
    private String groupDesc;
    private String groupRule;
    private Integer createTeacher;
    private String status;
    private Date createTime;
    private Date lastModify;
    private Integer chatId;
    private Integer groupAdminId;


    public Groups() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getGroupType() {
        return groupType;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public String getGroupRule() {
        return groupRule;
    }

    public void setGroupRule(String groupRule) {
        this.groupRule = groupRule;
    }

    public Integer getCreateTeacher() {
        return createTeacher;
    }

    public void setCreateTeacher(Integer createTeacher) {
        this.createTeacher = createTeacher;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModify() {
        return lastModify;
    }

    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public Integer getGroupAdminId() {
        return groupAdminId;
    }

    public void setGroupAdminId(Integer groupAdminId) {
        this.groupAdminId = groupAdminId;
    }

    @Override
    public String toString() {
        return "Groups{" +
                "userName='" + userName + '\'' +
                ", groupId=" + groupId +
                ", groupType=" + groupType +
                ", groupName='" + groupName + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", groupDesc='" + groupDesc + '\'' +
                ", groupRule='" + groupRule + '\'' +
                ", createTeacher=" + createTeacher +
                ", status='" + status + '\'' +
                ", createTime=" + createTime +
                ", lastModify=" + lastModify +
                ", chatId=" + chatId +
                ", groupAdminId=" + groupAdminId +
                '}';
    }

    public Groups(String userName, Integer groupId, Integer groupType, String groupName, String imgUrl, String groupDesc, String groupRule, Integer createTeacher, String status, Date createTime, Date lastModify, Integer chatId, Integer groupAdminId) {
        this.userName = userName;
        this.groupId = groupId;
        this.groupType = groupType;
        this.groupName = groupName;
        this.imgUrl = imgUrl;
        this.groupDesc = groupDesc;
        this.groupRule = groupRule;
        this.createTeacher = createTeacher;
        this.status = status;
        this.createTime = createTime;
        this.lastModify = lastModify;
        this.chatId = chatId;
        this.groupAdminId = groupAdminId;
    }
}
