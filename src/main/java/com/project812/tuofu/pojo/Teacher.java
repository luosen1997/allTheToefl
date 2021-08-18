package com.project812.tuofu.pojo;

import java.util.Date;

public class Teacher {
    private Integer teacherId;
    private String loginName;
    private String password;
    private String userName;
    private Integer sex;
    private String email;
    private Integer educationId;
    private String phoneNum;
    private Date birthday;
    private String introduce;
    private String imgUrl;
    private Integer articleNum;
    private Integer publicClassNum;
    private Integer castleClassNum;
    private Integer phraseNum;
    private Date createTime;
    private Integer status;
    private Date lastModify;

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", educationId=" + educationId +
                ", phoneNum='" + phoneNum + '\'' +
                ", birthday=" + birthday +
                ", introduce='" + introduce + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", articleNum=" + articleNum +
                ", publicClassNum=" + publicClassNum +
                ", castleClassNum=" + castleClassNum +
                ", phraseNum=" + phraseNum +
                ", createTime=" + createTime +
                ", status=" + status +
                ", lastModify=" + lastModify +
                '}';
    }

    public Teacher(Integer teacherId, String loginName, String password, String userName, Integer sex, String email, Integer educationId, String phoneNum, Date birthday, String introduce, String imgUrl, Integer articleNum, Integer publicClassNum, Integer castleClassNum, Integer phraseNum, Date createTime, Integer status, Date lastModify) {
        this.teacherId = teacherId;
        this.loginName = loginName;
        this.password = password;
        this.userName = userName;
        this.sex = sex;
        this.email = email;
        this.educationId = educationId;
        this.phoneNum = phoneNum;
        this.birthday = birthday;
        this.introduce = introduce;
        this.imgUrl = imgUrl;
        this.articleNum = articleNum;
        this.publicClassNum = publicClassNum;
        this.castleClassNum = castleClassNum;
        this.phraseNum = phraseNum;
        this.createTime = createTime;
        this.status = status;
        this.lastModify = lastModify;
    }

    public Teacher() {
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getArticleNum() {
        return articleNum;
    }

    public void setArticleNum(Integer articleNum) {
        this.articleNum = articleNum;
    }

    public Integer getPublicClassNum() {
        return publicClassNum;
    }

    public void setPublicClassNum(Integer publicClassNum) {
        this.publicClassNum = publicClassNum;
    }

    public Integer getCastleClassNum() {
        return castleClassNum;
    }

    public void setCastleClassNum(Integer castleClassNum) {
        this.castleClassNum = castleClassNum;
    }

    public Integer getPhraseNum() {
        return phraseNum;
    }

    public void setPhraseNum(Integer phraseNum) {
        this.phraseNum = phraseNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getLastModify() {
        return lastModify;
    }

    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }
}
