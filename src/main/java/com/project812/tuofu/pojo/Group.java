package com.project812.tuofu.pojo;

import java.util.Date;

public class Group {
    private Integer groupId;
    private String groupType;
    private String groupName;
    private String imgUrl;
    private String groupDesc;
    private String groupRule;
    private Integer  createTeacher;
    private Integer  status;
    private Date createTime;

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupType='" + groupType + '\'' +
                ", groupName='" + groupName + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", groupDesc='" + groupDesc + '\'' +
                ", groupRule='" + groupRule + '\'' +
                ", createTeacher=" + createTeacher +
                ", status=" + status +
                ", createTime=" + createTime +
                '}';
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
