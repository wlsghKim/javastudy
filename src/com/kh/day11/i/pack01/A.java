package com.kh.day11.i.pack01;

public class A {
  public int a; //동일 클래스 + 동일 패키지 + 다른 패키지
  protected int b; //동일 클래스 + 동일 패키지 내 + 다른 패키지라도 상속관계에 있으면 접근가능
  int c;  //default 동일 클래스 + 동일 패키지 내
  private int d; //동일 클래스

  void abc() {
  System.out.println(this.a);
  System.out.println(this.b);
  System.out.println(this.c);
  System.out.println(this.d);
  }
}

