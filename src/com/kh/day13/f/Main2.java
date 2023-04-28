package com.kh.day13.f;

public class Main2 {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동", 30);
    Person p2 = new Person("홍길동", 20);

    System.out.println(p1 == p2);
    System.out.println(p1.equals(p2));
  }
}
