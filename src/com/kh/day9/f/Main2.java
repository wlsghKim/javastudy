package com.kh.day9.f;

public class Main2 {
  public static void main(String[] args) {
    Person p = new Person();
    System.out.println(p);

    p.setName("홍길동");
    p.setAge(30);

    System.out.println(p);
    System.out.println(p.toString());
  }
}
