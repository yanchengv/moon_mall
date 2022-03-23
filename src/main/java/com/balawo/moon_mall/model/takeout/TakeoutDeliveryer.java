package com.balawo.moon_mall.model.takeout;


import java.util.HashMap;
import java.util.Map;

public class TakeoutDeliveryer {

  private long id;
  private String name;
  private String mobile;
  private String password;
  private String salt;
  private String email;
  private String avatar;
  private long status;
  private String token;
  private java.sql.Timestamp tokenExpireTime;
  private java.sql.Timestamp loginAt;
  private String loginIp;
  private String loginEquipment;
  private java.sql.Timestamp deletedAt;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
  private long typee;
  private long restaurantId;
  private String regionCode;

  //送餐员类型Typee = {0 => '暂无分配', 1 => '园区送餐员', 2 => '餐厅送餐员'}
  public static Map Typee;

  static {
    Typee = new HashMap();
    Typee.put(0,"暂无分配");
    Typee.put(1,"园区送餐员");
    Typee.put(2,"餐厅送餐员");
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
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


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  public java.sql.Timestamp getTokenExpireTime() {
    return tokenExpireTime;
  }

  public void setTokenExpireTime(java.sql.Timestamp tokenExpireTime) {
    this.tokenExpireTime = tokenExpireTime;
  }


  public java.sql.Timestamp getLoginAt() {
    return loginAt;
  }

  public void setLoginAt(java.sql.Timestamp loginAt) {
    this.loginAt = loginAt;
  }


  public String getLoginIp() {
    return loginIp;
  }

  public void setLoginIp(String loginIp) {
    this.loginIp = loginIp;
  }


  public String getLoginEquipment() {
    return loginEquipment;
  }

  public void setLoginEquipment(String loginEquipment) {
    this.loginEquipment = loginEquipment;
  }


  public java.sql.Timestamp getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(java.sql.Timestamp deletedAt) {
    this.deletedAt = deletedAt;
  }


  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public java.sql.Timestamp getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }


  public long getTypee() {
    return typee;
  }

  public void setTypee(long typee) {
    this.typee = typee;
  }


  public long getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(long restaurantId) {
    this.restaurantId = restaurantId;
  }


  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

}
