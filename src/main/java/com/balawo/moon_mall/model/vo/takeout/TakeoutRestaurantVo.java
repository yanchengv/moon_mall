package com.balawo.moon_mall.model.vo.takeout;

import lombok.*;


//@Data生成getter/setter toString()等方法
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TakeoutRestaurantVo {

  private long id;
  private String name;
  private long status;
  private String statusZh;
  private long sort;
  private long deliveryFastestTime;
  private long deliverySlowestTime;
  private String regionCode;
  private String createdAt;
}
