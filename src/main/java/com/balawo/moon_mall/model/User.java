package com.balawo.moon_mall.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class User implements Serializable {

     private Integer id;
     private String nickname;
     private String name;
     private String phone;
     private String email;
     private String avatar;
     private String address;
     private String idNumber;
     private Integer status;
     private Integer typee;
     private String token;
     private Date tokenExpireTime;
     private String unionid;
     private String desc;
     private String userSource;

    private Date deletedAt;
    //@JsonFormat(pattern = "yyyy/MM/dd hh:mm:ss", timezone = "GMT+8")
    private Date createdAt;
    private Date updatedAt;

    public static Map Status;
    static {
        Status = new HashMap();
        Status.put(0,"正常");
        Status.put(1,"禁用");
    }

    public User() {
    }

    public User(Integer id, String nickname, String name, String phone, String email, String avatar, String address, String idNumber, Integer status, Integer typee, String token, Date tokenExpireTime, String unionid, String desc, String userSource, Date deletedAt, Date createdAt, Date updatedAt) {
        this.id = id;
        this.nickname = nickname;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.avatar = avatar;
        this.address = address;
        this.idNumber = idNumber;
        this.status = status;
        this.typee = typee;
        this.token = token;
        this.tokenExpireTime = tokenExpireTime;
        this.unionid = unionid;
        this.desc = desc;
        this.userSource = userSource;
        this.deletedAt = deletedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTypee() {
        return typee;
    }

    public void setTypee(Integer typee) {
        this.typee = typee;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getTokenExpireTime() {
        return tokenExpireTime;
    }

    public void setTokenExpireTime(Date tokenExpireTime) {
        this.tokenExpireTime = tokenExpireTime;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUserSource() {
        return userSource;
    }

    public void setUserSource(String userSource) {
        this.userSource = userSource;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                ", address='" + address + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", status=" + status +
                ", typee=" + typee +
                ", token='" + token + '\'' +
                ", tokenExpireTime=" + tokenExpireTime +
                ", unionid='" + unionid + '\'' +
                ", desc='" + desc + '\'' +
                ", userSource='" + userSource + '\'' +
                ", deletedAt=" + deletedAt +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
