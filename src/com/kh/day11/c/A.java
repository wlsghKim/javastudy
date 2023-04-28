package com.kh.day11.c;

public class A {

  void print() {
    System.out.println("입력값이 없습니다.");

  }

  void print(int val) {
    System.out.println("정수 입력값: " + val);
  }


  public void print(double val) {
    System.out.println("실수 입력값: " + val);
  }

  public void print(String val) {
    System.out.println("문자열 입력값: " + val);
  }
}
