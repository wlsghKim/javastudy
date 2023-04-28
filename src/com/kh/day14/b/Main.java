package com.kh.day14.b;

public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
    Person p1 = new Person("홍길동", 30);

    p1.smile();
    p1.eat();

    System.out.println(p1);

    Person p2 = new Person("홍길동", 30);

    //동등비교
    if (p1.equals(p2)) {
      System.out.println("동등객체다");
    }else {
      System.out.println("동등객체가 아니다");
    }

    //객체 복사
    Person p3 = (Person) p2.clone();
    p3.smile();
    p3.eat();
    System.out.println(p3);

  }
}
