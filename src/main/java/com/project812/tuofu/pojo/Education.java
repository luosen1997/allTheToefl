package com.project812.tuofu.pojo;

public class Education {
    private Integer educationId;
    private String educationName;
    private String educationDesc;


    public Education(Integer educationId, String educationName, String educationDesc) {
        this.educationId = educationId;
        this.educationName = educationName;
        this.educationDesc = educationDesc;
    }

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    public String getEducationDesc() {
        return educationDesc;
    }

    public void setEducationDesc(String educationDesc) {
        this.educationDesc = educationDesc;
    }
}
