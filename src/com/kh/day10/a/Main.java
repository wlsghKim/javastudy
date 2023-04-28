package com.kh.day10.a;

public class Main {
  public static void main(String[] args) {
    Person p1 =new Person();

    p1.smile();
    p1.setName("홍길동");

    p1.getAge();
    p1.sleep();
    int age =p1.getAge();
    System.out.println(p1.getName()+"의 나이는" + age);

    p1.sleep();
    age = p1.getAge();
    System.out.println(p1.getName()+"의 나이는" + age);

  }
}
