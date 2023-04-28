package com.kh.day11.a;

import java.lang.*;

public class Test1 extends  Object{
private String field1;
private int field2;

  public Test1() {
        super(); //부모클래스의 디폴트 생성자호출
  }

  public Test1(String field1) {
    this.field1 = field1;
    System.out.println("public Test1(String field1) 호출됨");
  }


  public Test1(String field1, int field2) {
    //this.field1 = field1;
    this(field1);
    this.field2 = field2;
    System.out.println("public Test1(String field1, int field2) 호출됨");

  }



  @Override
  public String toString() {
    return "Test1{" +
        "field1='" + field1 + '\'' +
        ", field2='" + field2 + '\'' +
        '}';
  }
}

