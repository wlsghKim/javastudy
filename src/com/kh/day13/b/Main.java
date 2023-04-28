package com.kh.day13.b;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동", 20);
    Person p2 = new Person("홍길동");
    Person p3 = new Person(20);
    Person p4 = new Person();

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);
  }
}
