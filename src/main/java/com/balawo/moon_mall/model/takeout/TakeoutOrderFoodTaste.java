package com.balawo.moon_mall.model.takeout;



public class TakeoutOrderFoodTaste {

  private long id;
  private String name;
  private long userId;
  private long orderId;
  private long foodId;
  private long restaurantId;
  private long orderFoodId;
  private long tasteId;
  private String price;
  private long count;
  private String tasteAmount;
  private String remark;
  private java.sql.Timestamp deletedAt;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
  private long foodTasteGroupId;
  private String foodTasteGroupName;


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


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getFoodId() {
    return foodId;
  }

  public void setFoodId(long foodId) {
    this.foodId = foodId;
  }


  public long getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(long restaurantId) {
    this.restaurantId = restaurantId;
  }


  public long getOrderFoodId() {
    return orderFoodId;
  }

  public void setOrderFoodId(long orderFoodId) {
    this.orderFoodId = orderFoodId;
  }


  public long getTasteId() {
    return tasteId;
  }

  public void setTasteId(long tasteId) {
    this.tasteId = tasteId;
  }


  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }


  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }


  public String getTasteAmount() {
    return tasteAmount;
  }

  public void setTasteAmount(String tasteAmount) {
    this.tasteAmount = tasteAmount;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
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


  public long getFoodTasteGroupId() {
    return foodTasteGroupId;
  }

  public void setFoodTasteGroupId(long foodTasteGroupId) {
    this.foodTasteGroupId = foodTasteGroupId;
  }


  public String getFoodTasteGroupName() {
    return foodTasteGroupName;
  }

  public void setFoodTasteGroupName(String foodTasteGroupName) {
    this.foodTasteGroupName = foodTasteGroupName;
  }

}
