package com.kafkaproducer.kafkaproducer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * model class.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

  private String name;
  private String dept;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

}
