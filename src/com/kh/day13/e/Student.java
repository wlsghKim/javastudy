package com.kh.day13.e;

public class Student extends Person {
  String name = "홍길순";
  static int age =30;

  @Override
  public void eat() {
    System.out.println("맛있게 먹다");
  }
}
