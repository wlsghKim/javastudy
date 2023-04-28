package com.kh.day14.ex11;

public class Main {
  public static void main(String[] args) {
    A a1 = new A(3);
    A a2 = new A(3);
    System.out.println(a1.equals(a2));
    System.out.println(a1 == a2);

//    System.out.println(Objects.hash("홍길동1,30"));
//    System.out.println(Objects.hash("홍길동,30"));
//
//    System.out.println(a1.hashCode() == a2.hashCode());
  }
}
