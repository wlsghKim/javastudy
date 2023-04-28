package com.kh.day12.a;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동");
    p1.smile();
    String name = p1.getName();
    System.out.println(name);
    String status = p1.toString();
    System.out.println(status);
  }
}
