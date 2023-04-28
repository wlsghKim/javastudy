package com.kh.day9.f;

import java.lang.*;

public class Person extends Object{
  // 부모클래스 = Object 클래스
  private String name;
  private int age;

  public Person() {
    super(); //부모클래스의 디폴트생성자 메소드호출
    //Object클래스의 객체가 실체화 된다.
  }

  public void smile() {
    System.out.println("웃다");
  }

  public void sleep() {
    System.out.println("자다");
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }
  
  public void setName(String name){
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
