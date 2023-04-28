package com.kh.day15.b;

public class B implements A{
  @Override
  public void abc() {
    A.super.abc();
//    System.out.println("A 인터페이스 abc()");
    System.out.println("B 클래스의 abc()");

  }
}
