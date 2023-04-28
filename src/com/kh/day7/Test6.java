package com.kh.day7;

public class Test6 {
  public static void main(String[] args) {
    String name = "홍길동";
    System.out.println(name);
    System.out.println(name.toString());
    System.out.println(name.hashCode());
    System.out.println(System.identityHashCode(name));

    String name2 = "홍길동";
    System.out.println(System.identityHashCode(name2));

    String name3 = new String("홍길동"); //new가 들어가면 메모리가 새로 생겨 해시코드가 달라짐
    System.out.println(System.identityHashCode(name3));

    String name4 = new String("홍길동");
    System.out.println(System.identityHashCode(name4));

    String name5 = new String("홍길동");
    System.out.println(System.identityHashCode(name5));

    String name6 = "홍길동";
    System.out.println(System.identityHashCode(name6));


  }
}
