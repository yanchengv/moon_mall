package com.balawo.moon_mall.model.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

  private long id;
  private long companyId;
  private String name;
  private long status;
  private String phone;
  private long adminId;
  private Date deletedAt;
  private Date createdAt;
  private Date updatedAt;



}
