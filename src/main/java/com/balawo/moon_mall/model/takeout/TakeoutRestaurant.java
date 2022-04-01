package com.balawo.moon_mall.model.takeout;


import java.util.HashMap;
import java.util.Map;

public class TakeoutRestaurant {

  private long id;
  private String name;
  private long adminId;
  private long bossId;
  private long departmentId;
  private long status;
  private long deliveryFastestTime;
  private long deliverySlowestTime;
  private long isBreakfast;
  private long isLunch;
  private long isDinner;
  private java.sql.Time breakfastStartAt;
  private java.sql.Time breakfastEndAt;
  private java.sql.Time lunchStartAt;
  private java.sql.Time lunchEndAt;
  private java.sql.Time dinnerStartAt;
  private java.sql.Time dinnerEndAt;
  private long overallStar;
  private long commentCount;
  private String payType;
  private String bigImg;
  private String tablewarePrice;
  private String packagePrice;
  private String takeoutRule;
  private String remark;
  private java.sql.Timestamp deletedAt;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
  private long sort;
  private long likeCount;
  private String phone;
  private String identifier;
  private String breakfastName;
  private String lunchName;
  private String dinnerName;
  private String listImg;
  private String detailImg;
  private long salesNum;
  private long onlineStatus;
  private String orderMinPrice;
  private String deliveryType;
  private String pickPlace;
  private long pickTimeType;
  private String projectSource;
  private String orderListImg;
  private String businessTimesDesc;
  private String onlineStatusContent;
  private long isShow;
  private long deliveryTimeType;
  private String remarkPlaceholder;
  private long remarkIsRequire;
  private String regionCode;
  private String takeFoodDate;
  private long dinnerType;
  private long dinnerPayType;

  public static Map<Integer,String> Status;

  static {
    Status = new HashMap();
    Status.put(0,"上架");
    Status.put(1,"下架");
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


  public long getAdminId() {
    return adminId;
  }

  public void setAdminId(long adminId) {
    this.adminId = adminId;
  }


  public long getBossId() {
    return bossId;
  }

  public void setBossId(long bossId) {
    this.bossId = bossId;
  }


  public long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(long departmentId) {
    this.departmentId = departmentId;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getDeliveryFastestTime() {
    return deliveryFastestTime;
  }

  public void setDeliveryFastestTime(long deliveryFastestTime) {
    this.deliveryFastestTime = deliveryFastestTime;
  }


  public long getDeliverySlowestTime() {
    return deliverySlowestTime;
  }

  public void setDeliverySlowestTime(long deliverySlowestTime) {
    this.deliverySlowestTime = deliverySlowestTime;
  }


  public long getIsBreakfast() {
    return isBreakfast;
  }

  public void setIsBreakfast(long isBreakfast) {
    this.isBreakfast = isBreakfast;
  }


  public long getIsLunch() {
    return isLunch;
  }

  public void setIsLunch(long isLunch) {
    this.isLunch = isLunch;
  }


  public long getIsDinner() {
    return isDinner;
  }

  public void setIsDinner(long isDinner) {
    this.isDinner = isDinner;
  }


  public java.sql.Time getBreakfastStartAt() {
    return breakfastStartAt;
  }

  public void setBreakfastStartAt(java.sql.Time breakfastStartAt) {
    this.breakfastStartAt = breakfastStartAt;
  }


  public java.sql.Time getBreakfastEndAt() {
    return breakfastEndAt;
  }

  public void setBreakfastEndAt(java.sql.Time breakfastEndAt) {
    this.breakfastEndAt = breakfastEndAt;
  }


  public java.sql.Time getLunchStartAt() {
    return lunchStartAt;
  }

  public void setLunchStartAt(java.sql.Time lunchStartAt) {
    this.lunchStartAt = lunchStartAt;
  }


  public java.sql.Time getLunchEndAt() {
    return lunchEndAt;
  }

  public void setLunchEndAt(java.sql.Time lunchEndAt) {
    this.lunchEndAt = lunchEndAt;
  }


  public java.sql.Time getDinnerStartAt() {
    return dinnerStartAt;
  }

  public void setDinnerStartAt(java.sql.Time dinnerStartAt) {
    this.dinnerStartAt = dinnerStartAt;
  }


  public java.sql.Time getDinnerEndAt() {
    return dinnerEndAt;
  }

  public void setDinnerEndAt(java.sql.Time dinnerEndAt) {
    this.dinnerEndAt = dinnerEndAt;
  }


  public long getOverallStar() {
    return overallStar;
  }

  public void setOverallStar(long overallStar) {
    this.overallStar = overallStar;
  }


  public long getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(long commentCount) {
    this.commentCount = commentCount;
  }


  public String getPayType() {
    return payType;
  }

  public void setPayType(String payType) {
    this.payType = payType;
  }


  public String getBigImg() {
    return bigImg;
  }

  public void setBigImg(String bigImg) {
    this.bigImg = bigImg;
  }


  public String getTablewarePrice() {
    return tablewarePrice;
  }

  public void setTablewarePrice(String tablewarePrice) {
    this.tablewarePrice = tablewarePrice;
  }


  public String getPackagePrice() {
    return packagePrice;
  }

  public void setPackagePrice(String packagePrice) {
    this.packagePrice = packagePrice;
  }


  public String getTakeoutRule() {
    return takeoutRule;
  }

  public void setTakeoutRule(String takeoutRule) {
    this.takeoutRule = takeoutRule;
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


  public long getSort() {
    return sort;
  }

  public void setSort(long sort) {
    this.sort = sort;
  }


  public long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(long likeCount) {
    this.likeCount = likeCount;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public String getBreakfastName() {
    return breakfastName;
  }

  public void setBreakfastName(String breakfastName) {
    this.breakfastName = breakfastName;
  }


  public String getLunchName() {
    return lunchName;
  }

  public void setLunchName(String lunchName) {
    this.lunchName = lunchName;
  }


  public String getDinnerName() {
    return dinnerName;
  }

  public void setDinnerName(String dinnerName) {
    this.dinnerName = dinnerName;
  }


  public String getListImg() {
    return listImg;
  }

  public void setListImg(String listImg) {
    this.listImg = listImg;
  }


  public String getDetailImg() {
    return detailImg;
  }

  public void setDetailImg(String detailImg) {
    this.detailImg = detailImg;
  }


  public long getSalesNum() {
    return salesNum;
  }

  public void setSalesNum(long salesNum) {
    this.salesNum = salesNum;
  }


  public long getOnlineStatus() {
    return onlineStatus;
  }

  public void setOnlineStatus(long onlineStatus) {
    this.onlineStatus = onlineStatus;
  }


  public String getOrderMinPrice() {
    return orderMinPrice;
  }

  public void setOrderMinPrice(String orderMinPrice) {
    this.orderMinPrice = orderMinPrice;
  }


  public String getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
  }


  public String getPickPlace() {
    return pickPlace;
  }

  public void setPickPlace(String pickPlace) {
    this.pickPlace = pickPlace;
  }


  public long getPickTimeType() {
    return pickTimeType;
  }

  public void setPickTimeType(long pickTimeType) {
    this.pickTimeType = pickTimeType;
  }


  public String getProjectSource() {
    return projectSource;
  }

  public void setProjectSource(String projectSource) {
    this.projectSource = projectSource;
  }


  public String getOrderListImg() {
    return orderListImg;
  }

  public void setOrderListImg(String orderListImg) {
    this.orderListImg = orderListImg;
  }


  public String getBusinessTimesDesc() {
    return businessTimesDesc;
  }

  public void setBusinessTimesDesc(String businessTimesDesc) {
    this.businessTimesDesc = businessTimesDesc;
  }


  public String getOnlineStatusContent() {
    return onlineStatusContent;
  }

  public void setOnlineStatusContent(String onlineStatusContent) {
    this.onlineStatusContent = onlineStatusContent;
  }


  public long getIsShow() {
    return isShow;
  }

  public void setIsShow(long isShow) {
    this.isShow = isShow;
  }


  public long getDeliveryTimeType() {
    return deliveryTimeType;
  }

  public void setDeliveryTimeType(long deliveryTimeType) {
    this.deliveryTimeType = deliveryTimeType;
  }


  public String getRemarkPlaceholder() {
    return remarkPlaceholder;
  }

  public void setRemarkPlaceholder(String remarkPlaceholder) {
    this.remarkPlaceholder = remarkPlaceholder;
  }


  public long getRemarkIsRequire() {
    return remarkIsRequire;
  }

  public void setRemarkIsRequire(long remarkIsRequire) {
    this.remarkIsRequire = remarkIsRequire;
  }


  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }


  public String getTakeFoodDate() {
    return takeFoodDate;
  }

  public void setTakeFoodDate(String takeFoodDate) {
    this.takeFoodDate = takeFoodDate;
  }


  public long getDinnerType() {
    return dinnerType;
  }

  public void setDinnerType(long dinnerType) {
    this.dinnerType = dinnerType;
  }


  public long getDinnerPayType() {
    return dinnerPayType;
  }

  public void setDinnerPayType(long dinnerPayType) {
    this.dinnerPayType = dinnerPayType;
  }

  @Override
  public String toString() {
    return "TakeoutRestaurant{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", adminId=" + adminId +
            ", bossId=" + bossId +
            ", departmentId=" + departmentId +
            ", status=" + status +
            ", deliveryFastestTime=" + deliveryFastestTime +
            ", deliverySlowestTime=" + deliverySlowestTime +
            ", isBreakfast=" + isBreakfast +
            ", isLunch=" + isLunch +
            ", isDinner=" + isDinner +
            ", breakfastStartAt=" + breakfastStartAt +
            ", breakfastEndAt=" + breakfastEndAt +
            ", lunchStartAt=" + lunchStartAt +
            ", lunchEndAt=" + lunchEndAt +
            ", dinnerStartAt=" + dinnerStartAt +
            ", dinnerEndAt=" + dinnerEndAt +
            ", overallStar=" + overallStar +
            ", commentCount=" + commentCount +
            ", payType='" + payType + '\'' +
            ", bigImg='" + bigImg + '\'' +
            ", tablewarePrice='" + tablewarePrice + '\'' +
            ", packagePrice='" + packagePrice + '\'' +
            ", takeoutRule='" + takeoutRule + '\'' +
            ", remark='" + remark + '\'' +
            ", deletedAt=" + deletedAt +
            ", createdAt=" + createdAt +
            ", updatedAt=" + updatedAt +
            ", sort=" + sort +
            ", likeCount=" + likeCount +
            ", phone='" + phone + '\'' +
            ", identifier='" + identifier + '\'' +
            ", breakfastName='" + breakfastName + '\'' +
            ", lunchName='" + lunchName + '\'' +
            ", dinnerName='" + dinnerName + '\'' +
            ", listImg='" + listImg + '\'' +
            ", detailImg='" + detailImg + '\'' +
            ", salesNum=" + salesNum +
            ", onlineStatus=" + onlineStatus +
            ", orderMinPrice='" + orderMinPrice + '\'' +
            ", deliveryType='" + deliveryType + '\'' +
            ", pickPlace='" + pickPlace + '\'' +
            ", pickTimeType=" + pickTimeType +
            ", projectSource='" + projectSource + '\'' +
            ", orderListImg='" + orderListImg + '\'' +
            ", businessTimesDesc='" + businessTimesDesc + '\'' +
            ", onlineStatusContent='" + onlineStatusContent + '\'' +
            ", isShow=" + isShow +
            ", deliveryTimeType=" + deliveryTimeType +
            ", remarkPlaceholder='" + remarkPlaceholder + '\'' +
            ", remarkIsRequire=" + remarkIsRequire +
            ", regionCode='" + regionCode + '\'' +
            ", takeFoodDate='" + takeFoodDate + '\'' +
            ", dinnerType=" + dinnerType +
            ", dinnerPayType=" + dinnerPayType +
            '}';
  }
}
