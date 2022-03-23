package com.balawo.moon_mall.model.common;

import java.io.Serializable;
import java.util.Date;

public class UserCard implements Serializable {
    private Long id;
    private  Long userId;
    private String cardNo;
    private String cardType;
    private String cardLevel;
    private Integer status;
    private String realname;
    private String lastname;
    private int sex;
    private String idType;
    private String idNumber;
    private String mobile;
    private Date birth;
    private Date memCreatedAt;
    private Date deletedAt;
    private Date CreatedAt;
    private Date updatedAt;
    private String lvyunCardId;
    private String lvyunMemberID;
    private int isSupplementCard;
    private Long adminId;
    private Date qrcodeExpireAt;
    private String paramsContent;

    public UserCard() {
    }

    public UserCard(Long id, Long userId, String cardNo, String cardType, String cardLevel, Integer status, String realname, String lastname, int sex, String idType, String idNumber, String mobile, Date birth, Date memCreatedAt, Date deletedAt, Date createdAt, Date updatedAt, String lvyunCardId, String lvyunMemberID, int isSupplementCard, Long adminId, Date qrcodeExpireAt, String paramsContent) {
        this.id = id;
        this.userId = userId;
        this.cardNo = cardNo;
        this.cardType = cardType;
        this.cardLevel = cardLevel;
        this.status = status;
        this.realname = realname;
        this.lastname = lastname;
        this.sex = sex;
        this.idType = idType;
        this.idNumber = idNumber;
        this.mobile = mobile;
        this.birth = birth;
        this.memCreatedAt = memCreatedAt;
        this.deletedAt = deletedAt;
        CreatedAt = createdAt;
        this.updatedAt = updatedAt;
        this.lvyunCardId = lvyunCardId;
        this.lvyunMemberID = lvyunMemberID;
        this.isSupplementCard = isSupplementCard;
        this.adminId = adminId;
        this.qrcodeExpireAt = qrcodeExpireAt;
        this.paramsContent = paramsContent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardLevel() {
        return cardLevel;
    }

    public void setCardLevel(String cardLevel) {
        this.cardLevel = cardLevel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getMemCreatedAt() {
        return memCreatedAt;
    }

    public void setMemCreatedAt(Date memCreatedAt) {
        this.memCreatedAt = memCreatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Date getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        CreatedAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getLvyunCardId() {
        return lvyunCardId;
    }

    public void setLvyunCardId(String lvyunCardId) {
        this.lvyunCardId = lvyunCardId;
    }

    public String getLvyunMemberID() {
        return lvyunMemberID;
    }

    public void setLvyunMemberID(String lvyunMemberID) {
        this.lvyunMemberID = lvyunMemberID;
    }

    public int getIsSupplementCard() {
        return isSupplementCard;
    }

    public void setIsSupplementCard(int isSupplementCard) {
        this.isSupplementCard = isSupplementCard;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Date getQrcodeExpireAt() {
        return qrcodeExpireAt;
    }

    public void setQrcodeExpireAt(Date qrcodeExpireAt) {
        this.qrcodeExpireAt = qrcodeExpireAt;
    }

    public String getParamsContent() {
        return paramsContent;
    }

    public void setParamsContent(String paramsContent) {
        this.paramsContent = paramsContent;
    }

    @Override
    public String toString() {
        return "UserCard{" +
                "id=" + id +
                ", userId=" + userId +
                ", cardNo='" + cardNo + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardLevel='" + cardLevel + '\'' +
                ", status=" + status +
                ", realname='" + realname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", sex=" + sex +
                ", idType='" + idType + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", mobile='" + mobile + '\'' +
                ", birth=" + birth +
                ", memCreatedAt=" + memCreatedAt +
                ", deletedAt=" + deletedAt +
                ", CreatedAt=" + CreatedAt +
                ", updatedAt=" + updatedAt +
                ", lvyunCardId='" + lvyunCardId + '\'' +
                ", lvyunMemberID='" + lvyunMemberID + '\'' +
                ", isSupplementCard=" + isSupplementCard +
                ", adminId=" + adminId +
                ", qrcodeExpireAt=" + qrcodeExpireAt +
                ", paramsContent='" + paramsContent + '\'' +
                '}';
    }
}
