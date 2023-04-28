package com.kh.day11.b;

public class HighStudent extends Student {
  public HighStudent() {
    super();
    System.out.println("public HighStudent() called!");

  }

  public void method1() {
    System.out.println("method1() of HighStudent called!");
  super.method1();
  }
}