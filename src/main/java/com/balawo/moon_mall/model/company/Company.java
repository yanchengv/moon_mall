package com.balawo.moon_mall.model.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {

  private long id;
  private String name;
  private String receiptApp;
  private long status;
  private String phone;
  private long adminId;
  private Date deletedAt;
  private Date createdAt;
  private Date updatedAt;

  public List<Department> departmentList;


}
