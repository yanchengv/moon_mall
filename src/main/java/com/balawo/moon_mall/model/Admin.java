package com.balawo.moon_mall.model;


import java.io.Serializable;
import java.util.Date;


public class Admin implements Serializable {

    private Long id;
    private String nickname;
    private String name;
    private String mobile;
    private String email;
    private String avatar;
    private Date deletedAt;
    //@JsonFormat(pattern = "yyyy/MM/dd hh:mm:ss", timezone = "GMT+8")
    private Date createdAt;
    private Date updatedAt;

    public Admin() {
    }

    public Admin(Long id, String nickname, String name, String mobile, String email, String avatar, Date deletedAt, Date createdAt, Date updatedAt) {
        this.id = id;
        this.nickname = nickname;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.avatar = avatar;
        this.deletedAt = deletedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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
        return "Admin{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                ", deletedAt='" + deletedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updateAt='" + updatedAt + '\'' +
                '}';
    }
}
