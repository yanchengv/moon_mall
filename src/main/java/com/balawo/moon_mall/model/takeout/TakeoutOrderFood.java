package com.balawo.moon_mall.model.takeout;


import java.util.HashMap;
import java.util.Map;

public class TakeoutOrderFood {

  private long id;
  private long userId;
  private long orderId;
  private long restaurantId;
  private long foodId;
  private String name;
  private String subname;
  private String price;
  private long count;
  private String amount;
  private String packageAmount;
  private String tasteAmount;
  private long packageCount;
  private String packagePrice;
  private long typee;
  private long openType;
  private String img;
  private String storyTitle;
  private String storyContent;
  private String detail;
  private String remark;
  private java.sql.Timestamp deletedAt;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
  private String discount;
  private String originalAmount;
  private long status;
  private String refundPrice;
  private java.sql.Timestamp refundApplyAt;
  private java.sql.Timestamp refundSuccessAt;
  private String refundReason;
  private String pingxxRefundId;
  private long refundNum;
  private String refundRecords;
  private String cinvcode;
  private String cinvcodeName;

  //0 => '正常', 1 => '申请退款', 2 => '退款中', 3 => '退款完成'
  public static Map Status;
  static {
    Status = new HashMap();
    Status.put(0,"正常");
    Status.put(1,"申请退款");
    Status.put(2,"退款中");
    Status.put(3,"退款完成");
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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


  public long getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(long restaurantId) {
    this.restaurantId = restaurantId;
  }


  public long getFoodId() {
    return foodId;
  }

  public void setFoodId(long foodId) {
    this.foodId = foodId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getSubname() {
    return subname;
  }

  public void setSubname(String subname) {
    this.subname = subname;
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


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  public String getPackageAmount() {
    return packageAmount;
  }

  public void setPackageAmount(String packageAmount) {
    this.packageAmount = packageAmount;
  }


  public String getTasteAmount() {
    return tasteAmount;
  }

  public void setTasteAmount(String tasteAmount) {
    this.tasteAmount = tasteAmount;
  }


  public long getPackageCount() {
    return packageCount;
  }

  public void setPackageCount(long packageCount) {
    this.packageCount = packageCount;
  }


  public String getPackagePrice() {
    return packagePrice;
  }

  public void setPackagePrice(String packagePrice) {
    this.packagePrice = packagePrice;
  }


  public long getTypee() {
    return typee;
  }

  public void setTypee(long typee) {
    this.typee = typee;
  }


  public long getOpenType() {
    return openType;
  }

  public void setOpenType(long openType) {
    this.openType = openType;
  }


  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }


  public String getStoryTitle() {
    return storyTitle;
  }

  public void setStoryTitle(String storyTitle) {
    this.storyTitle = storyTitle;
  }


  public String getStoryContent() {
    return storyContent;
  }

  public void setStoryContent(String storyContent) {
    this.storyContent = storyContent;
  }


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
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


  public String getDiscount() {
    return discount;
  }

  public void setDiscount(String discount) {
    this.discount = discount;
  }


  public String getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(String originalAmount) {
    this.originalAmount = originalAmount;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getRefundPrice() {
    return refundPrice;
  }

  public void setRefundPrice(String refundPrice) {
    this.refundPrice = refundPrice;
  }


  public java.sql.Timestamp getRefundApplyAt() {
    return refundApplyAt;
  }

  public void setRefundApplyAt(java.sql.Timestamp refundApplyAt) {
    this.refundApplyAt = refundApplyAt;
  }


  public java.sql.Timestamp getRefundSuccessAt() {
    return refundSuccessAt;
  }

  public void setRefundSuccessAt(java.sql.Timestamp refundSuccessAt) {
    this.refundSuccessAt = refundSuccessAt;
  }


  public String getRefundReason() {
    return refundReason;
  }

  public void setRefundReason(String refundReason) {
    this.refundReason = refundReason;
  }


  public String getPingxxRefundId() {
    return pingxxRefundId;
  }

  public void setPingxxRefundId(String pingxxRefundId) {
    this.pingxxRefundId = pingxxRefundId;
  }


  public long getRefundNum() {
    return refundNum;
  }

  public void setRefundNum(long refundNum) {
    this.refundNum = refundNum;
  }


  public String getRefundRecords() {
    return refundRecords;
  }

  public void setRefundRecords(String refundRecords) {
    this.refundRecords = refundRecords;
  }


  public String getCinvcode() {
    return cinvcode;
  }

  public void setCinvcode(String cinvcode) {
    this.cinvcode = cinvcode;
  }


  public String getCinvcodeName() {
    return cinvcodeName;
  }

  public void setCinvcodeName(String cinvcodeName) {
    this.cinvcodeName = cinvcodeName;
  }

  @Override
  public String toString() {
    return "TakeoutOrderFood{" +
            "id=" + id +
            ", userId=" + userId +
            ", orderId=" + orderId +
            ", restaurantId=" + restaurantId +
            ", foodId=" + foodId +
            ", name='" + name + '\'' +
            ", subname='" + subname + '\'' +
            ", price='" + price + '\'' +
            ", count=" + count +
            ", amount='" + amount + '\'' +
            ", packageAmount='" + packageAmount + '\'' +
            ", tasteAmount='" + tasteAmount + '\'' +
            ", packageCount=" + packageCount +
            ", packagePrice='" + packagePrice + '\'' +
            ", typee=" + typee +
            ", openType=" + openType +
            ", img='" + img + '\'' +
            ", storyTitle='" + storyTitle + '\'' +
            ", storyContent='" + storyContent + '\'' +
            ", detail='" + detail + '\'' +
            ", remark='" + remark + '\'' +
            ", deletedAt=" + deletedAt +
            ", createdAt=" + createdAt +
            ", updatedAt=" + updatedAt +
            ", discount='" + discount + '\'' +
            ", originalAmount='" + originalAmount + '\'' +
            ", status=" + status +
            ", refundPrice='" + refundPrice + '\'' +
            ", refundApplyAt=" + refundApplyAt +
            ", refundSuccessAt=" + refundSuccessAt +
            ", refundReason='" + refundReason + '\'' +
            ", pingxxRefundId='" + pingxxRefundId + '\'' +
            ", refundNum=" + refundNum +
            ", refundRecords='" + refundRecords + '\'' +
            ", cinvcode='" + cinvcode + '\'' +
            ", cinvcodeName='" + cinvcodeName + '\'' +
            '}';
  }
}
