package com.project812.tuofu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Links {
    private Integer linkId;
    private String linkName;
    private String linkUrl;
    private String relateUnit;
    private String linkDesc;
    private Date lastModify;

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getRelateUnit() {
        return relateUnit;
    }

    public void setRelateUnit(String relateUnit) {
        this.relateUnit = relateUnit;
    }

    public String getLinkDesc() {
        return linkDesc;
    }

    public void setLinkDesc(String linkDesc) {
        this.linkDesc = linkDesc;
    }

    public Date getLastModify() {
        return lastModify;
    }

    public void setLastModify(Date last_modify) {
        this.lastModify = last_modify;
    }

    @Override
    public String toString() {
        return "Links{" +
                "linkId=" + linkId +
                ", linkName='" + linkName + '\'' +
                ", linkUrl='" + linkUrl + '\'' +
                ", relateUnit='" + relateUnit + '\'' +
                ", linkDesc='" + linkDesc + '\'' +
                ", last_modify=" + lastModify +
                '}';
    }

    public Links() {
    }

    public Links(Integer linkId, String linkName, String linkUrl, String relateUnit, String linkDesc, Date lastModify) {
        this.linkId = linkId;
        this.linkName = linkName;
        this.linkUrl = linkUrl;
        this.relateUnit = relateUnit;
        this.linkDesc = linkDesc;
        this.lastModify = lastModify;
    }
}
