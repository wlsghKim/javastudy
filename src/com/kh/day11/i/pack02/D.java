package com.kh.day11.i.pack02;

import com.kh.day11.i.pack01.A;

public class D extends A {
  void def() {
    System.out.println(this.a);
    System.out.println(this.b); //다른 패키지여도 상속관계여서 접근 가능
//    System.out.println(this.c);
//    System.out.println(this.d);
  }
}
