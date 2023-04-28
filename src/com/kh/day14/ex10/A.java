package com.kh.day14.ex10;

class A {
  A(){
    System.out.println("A 생성자1");
  }

  A(int a) {
    this();
    System.out.println("A 생성자2");
  }
}
