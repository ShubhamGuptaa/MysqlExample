package com.mysqlexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ModelMysql {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   @Column
   private String name;
   @Column
   private int age;

   public ModelMysql(){}

public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}

}
