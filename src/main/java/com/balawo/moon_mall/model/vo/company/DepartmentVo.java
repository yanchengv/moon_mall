package com.balawo.moon_mall.model.vo.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentVo {

  private long id;
  private long companyId;
  private String name;



}
