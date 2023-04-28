package com.kh.day14.c;
//하위 개념 확장 불가
final public class Person {
  final String name;

  public Person(String name) {
    this.name = name;

  }
  //하위 개념에서 메소드 재정의 불가
  final public void eat() {
    System.out.println("먹다");

  }
}
