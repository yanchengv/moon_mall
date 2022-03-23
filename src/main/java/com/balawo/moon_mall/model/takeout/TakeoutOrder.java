package com.balawo.moon_mall.model.takeout;


import com.balawo.moon_mall.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TakeoutOrder {

  private long id;
  private long userId;
  private long restaurantId;
  private long departmentId;
  private String orderNo;
  private String amount;
  private long status;
  private String realname;
  private String phone;
  private String address;
  private String chargeId;
  private long payType;
  private java.sql.Timestamp payAt;
  private long deliveryType;
  private String bookingDeliveryAt;
  private long isOntime;
  private long tablewareCount;
  private String tablewarePrice;
  private long packageCount;
  private String packagePrice;
  private String tablewareAmount;
  private String packageAmount;
  private String deliveryAmount;
  private String tasteAmount;
  private String refundReason;
  private String refundPrice;
  private java.sql.Timestamp refundApplyAt;
  private java.sql.Timestamp refundSuccessAt;
  private String remark;
  private java.sql.Timestamp deletedAt;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
  private String payAccount;
  private long printNum;
  private long deliveryerId;
  private java.sql.Timestamp deliveryerAt;
  private String originalAmount;
  private String sequenceNo;
  private long deliveryTimeId;
  private String deliveryStartAt;
  private String deliveryEndAt;
  private String addressIds;
  private java.sql.Timestamp arrangeDeliveryerAt;
  private String receiptApp;
  private String pingxxOrderId;
  private String clientIp;
  private long deliveryerTypee;
  private String channelType;
  private String restaurantName;
  private String deliveryerName;
  private String deliveryerPhone;
  private java.sql.Timestamp deliveryerReceivedOrderAt;
  private String orderRemark;
  private long remarkAdminId;
  private java.sql.Timestamp mealFinishedAt;
  private long deliveryTimeType;
  private String regionCode;

  private TakeoutRestaurant takeoutRestaurant;
  private User user;
  private List<TakeoutOrderFood> takeoutOrderFood;
  private TakeoutDeliveryer takeoutDeliveryer;

  public static Map Status;
  public static Map DeliveryType;
  static {
    Status = new HashMap();
    Status.put(1,"待支付");
    Status.put(15,"支付中");
    Status.put(4,"备餐中");
    Status.put(16,"备餐完成");
    Status.put(13,"待配送");
    Status.put(6,"配送中");
    Status.put(14,"待取餐");
    Status.put(7,"待评价");
    Status.put(8,"已完成");
    Status.put(9,"已取消");
    Status.put(11,"退款中");
    Status.put(12,"已退款");

    //配送方式
    DeliveryType = new HashMap();
    DeliveryType.put(1,"尽快送餐");
    DeliveryType.put(2,"预订时间");
    DeliveryType.put(3,"打包自提");

  }


  public TakeoutRestaurant getTakeoutRestaurant() {
    return takeoutRestaurant;
  }

  public void setTakeoutRestaurant(TakeoutRestaurant takeoutRestaurant) {
    this.takeoutRestaurant = takeoutRestaurant;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public List<TakeoutOrderFood> getTakeoutOrderFood() {
    return takeoutOrderFood;
  }

  public void setTakeoutOrderFood(List<TakeoutOrderFood> takeoutOrderFood) {
    this.takeoutOrderFood = takeoutOrderFood;
  }

  public TakeoutDeliveryer getTakeoutDeliveryer() {
    return takeoutDeliveryer;
  }

  public void setTakeoutDeliveryer(TakeoutDeliveryer takeoutDeliveryer) {
    this.takeoutDeliveryer = takeoutDeliveryer;
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


  public long getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(long restaurantId) {
    this.restaurantId = restaurantId;
  }


  public long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(long departmentId) {
    this.departmentId = departmentId;
  }


  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getChargeId() {
    return chargeId;
  }

  public void setChargeId(String chargeId) {
    this.chargeId = chargeId;
  }


  public long getPayType() {
    return payType;
  }

  public void setPayType(long payType) {
    this.payType = payType;
  }


  public java.sql.Timestamp getPayAt() {
    return payAt;
  }

  public void setPayAt(java.sql.Timestamp payAt) {
    this.payAt = payAt;
  }


  public long getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(long deliveryType) {
    this.deliveryType = deliveryType;
  }


  public String getBookingDeliveryAt() {
    return bookingDeliveryAt;
  }

  public void setBookingDeliveryAt(String bookingDeliveryAt) {
    this.bookingDeliveryAt = bookingDeliveryAt;
  }


  public long getIsOntime() {
    return isOntime;
  }

  public void setIsOntime(long isOntime) {
    this.isOntime = isOntime;
  }


  public long getTablewareCount() {
    return tablewareCount;
  }

  public void setTablewareCount(long tablewareCount) {
    this.tablewareCount = tablewareCount;
  }


  public String getTablewarePrice() {
    return tablewarePrice;
  }

  public void setTablewarePrice(String tablewarePrice) {
    this.tablewarePrice = tablewarePrice;
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


  public String getTablewareAmount() {
    return tablewareAmount;
  }

  public void setTablewareAmount(String tablewareAmount) {
    this.tablewareAmount = tablewareAmount;
  }


  public String getPackageAmount() {
    return packageAmount;
  }

  public void setPackageAmount(String packageAmount) {
    this.packageAmount = packageAmount;
  }


  public String getDeliveryAmount() {
    return deliveryAmount;
  }

  public void setDeliveryAmount(String deliveryAmount) {
    this.deliveryAmount = deliveryAmount;
  }


  public String getTasteAmount() {
    return tasteAmount;
  }

  public void setTasteAmount(String tasteAmount) {
    this.tasteAmount = tasteAmount;
  }


  public String getRefundReason() {
    return refundReason;
  }

  public void setRefundReason(String refundReason) {
    this.refundReason = refundReason;
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


  public String getPayAccount() {
    return payAccount;
  }

  public void setPayAccount(String payAccount) {
    this.payAccount = payAccount;
  }


  public long getPrintNum() {
    return printNum;
  }

  public void setPrintNum(long printNum) {
    this.printNum = printNum;
  }


  public long getDeliveryerId() {
    return deliveryerId;
  }

  public void setDeliveryerId(long deliveryerId) {
    this.deliveryerId = deliveryerId;
  }


  public java.sql.Timestamp getDeliveryerAt() {
    return deliveryerAt;
  }

  public void setDeliveryerAt(java.sql.Timestamp deliveryerAt) {
    this.deliveryerAt = deliveryerAt;
  }


  public String getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(String originalAmount) {
    this.originalAmount = originalAmount;
  }


  public String getSequenceNo() {
    return sequenceNo;
  }

  public void setSequenceNo(String sequenceNo) {
    this.sequenceNo = sequenceNo;
  }


  public long getDeliveryTimeId() {
    return deliveryTimeId;
  }

  public void setDeliveryTimeId(long deliveryTimeId) {
    this.deliveryTimeId = deliveryTimeId;
  }


  public String getDeliveryStartAt() {
    return deliveryStartAt;
  }

  public void setDeliveryStartAt(String deliveryStartAt) {
    this.deliveryStartAt = deliveryStartAt;
  }


  public String getDeliveryEndAt() {
    return deliveryEndAt;
  }

  public void setDeliveryEndAt(String deliveryEndAt) {
    this.deliveryEndAt = deliveryEndAt;
  }


  public String getAddressIds() {
    return addressIds;
  }

  public void setAddressIds(String addressIds) {
    this.addressIds = addressIds;
  }


  public java.sql.Timestamp getArrangeDeliveryerAt() {
    return arrangeDeliveryerAt;
  }

  public void setArrangeDeliveryerAt(java.sql.Timestamp arrangeDeliveryerAt) {
    this.arrangeDeliveryerAt = arrangeDeliveryerAt;
  }


  public String getReceiptApp() {
    return receiptApp;
  }

  public void setReceiptApp(String receiptApp) {
    this.receiptApp = receiptApp;
  }


  public String getPingxxOrderId() {
    return pingxxOrderId;
  }

  public void setPingxxOrderId(String pingxxOrderId) {
    this.pingxxOrderId = pingxxOrderId;
  }


  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }


  public long getDeliveryerTypee() {
    return deliveryerTypee;
  }

  public void setDeliveryerTypee(long deliveryerTypee) {
    this.deliveryerTypee = deliveryerTypee;
  }


  public String getChannelType() {
    return channelType;
  }

  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }


  public String getRestaurantName() {
    return restaurantName;
  }

  public void setRestaurantName(String restaurantName) {
    this.restaurantName = restaurantName;
  }


  public String getDeliveryerName() {
    return deliveryerName;
  }

  public void setDeliveryerName(String deliveryerName) {
    this.deliveryerName = deliveryerName;
  }


  public String getDeliveryerPhone() {
    return deliveryerPhone;
  }

  public void setDeliveryerPhone(String deliveryerPhone) {
    this.deliveryerPhone = deliveryerPhone;
  }


  public java.sql.Timestamp getDeliveryerReceivedOrderAt() {
    return deliveryerReceivedOrderAt;
  }

  public void setDeliveryerReceivedOrderAt(java.sql.Timestamp deliveryerReceivedOrderAt) {
    this.deliveryerReceivedOrderAt = deliveryerReceivedOrderAt;
  }


  public String getOrderRemark() {
    return orderRemark;
  }

  public void setOrderRemark(String orderRemark) {
    this.orderRemark = orderRemark;
  }


  public long getRemarkAdminId() {
    return remarkAdminId;
  }

  public void setRemarkAdminId(long remarkAdminId) {
    this.remarkAdminId = remarkAdminId;
  }


  public java.sql.Timestamp getMealFinishedAt() {
    return mealFinishedAt;
  }

  public void setMealFinishedAt(java.sql.Timestamp mealFinishedAt) {
    this.mealFinishedAt = mealFinishedAt;
  }


  public long getDeliveryTimeType() {
    return deliveryTimeType;
  }

  public void setDeliveryTimeType(long deliveryTimeType) {
    this.deliveryTimeType = deliveryTimeType;
  }


  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

    @Override
    public String toString() {
        return "TakeoutOrders{" +
                "id=" + id +
                ", userId=" + userId +
                ", restaurantId=" + restaurantId +
                ", departmentId=" + departmentId +
                ", orderNo='" + orderNo + '\'' +
                ", amount='" + amount + '\'' +
                ", status=" + status +
                ", realname='" + realname + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", chargeId='" + chargeId + '\'' +
                ", payType=" + payType +
                ", payAt=" + payAt +
                ", deliveryType=" + deliveryType +
                ", bookingDeliveryAt='" + bookingDeliveryAt + '\'' +
                ", isOntime=" + isOntime +
                ", tablewareCount=" + tablewareCount +
                ", tablewarePrice='" + tablewarePrice + '\'' +
                ", packageCount=" + packageCount +
                ", packagePrice='" + packagePrice + '\'' +
                ", tablewareAmount='" + tablewareAmount + '\'' +
                ", packageAmount='" + packageAmount + '\'' +
                ", deliveryAmount='" + deliveryAmount + '\'' +
                ", tasteAmount='" + tasteAmount + '\'' +
                ", refundReason='" + refundReason + '\'' +
                ", refundPrice='" + refundPrice + '\'' +
                ", refundApplyAt=" + refundApplyAt +
                ", refundSuccessAt=" + refundSuccessAt +
                ", remark='" + remark + '\'' +
                ", deletedAt=" + deletedAt +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", payAccount='" + payAccount + '\'' +
                ", printNum=" + printNum +
                ", deliveryerId=" + deliveryerId +
                ", deliveryerAt=" + deliveryerAt +
                ", originalAmount='" + originalAmount + '\'' +
                ", sequenceNo='" + sequenceNo + '\'' +
                ", deliveryTimeId=" + deliveryTimeId +
                ", deliveryStartAt='" + deliveryStartAt + '\'' +
                ", deliveryEndAt='" + deliveryEndAt + '\'' +
                ", addressIds='" + addressIds + '\'' +
                ", arrangeDeliveryerAt=" + arrangeDeliveryerAt +
                ", receiptApp='" + receiptApp + '\'' +
                ", pingxxOrderId='" + pingxxOrderId + '\'' +
                ", clientIp='" + clientIp + '\'' +
                ", deliveryerTypee=" + deliveryerTypee +
                ", channelType='" + channelType + '\'' +
                ", restaurantName='" + restaurantName + '\'' +
                ", deliveryerName='" + deliveryerName + '\'' +
                ", deliveryerPhone='" + deliveryerPhone + '\'' +
                ", deliveryerReceivedOrderAt=" + deliveryerReceivedOrderAt +
                ", orderRemark='" + orderRemark + '\'' +
                ", remarkAdminId=" + remarkAdminId +
                ", mealFinishedAt=" + mealFinishedAt +
                ", deliveryTimeType=" + deliveryTimeType +
                ", regionCode='" + regionCode + '\'' +
                '}';
    }
}
