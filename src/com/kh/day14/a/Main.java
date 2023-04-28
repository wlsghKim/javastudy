package com.kh.day14.a;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동", 20);
    Person p2 = new Person("홍길순", 30);
    Person p3 = new Person("홍길순", 30);

    //주소비교
    System.out.println(p2 == p3);
    //내용비교
    System.out.println(p2.equals(p3));
    System.out.println(p2.hashCode() == p3.hashCode());
  }
}
