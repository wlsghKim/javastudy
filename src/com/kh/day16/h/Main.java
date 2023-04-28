package com.kh.day16.h;

import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    TreeSet<Person> peoples = new TreeSet<>();

    peoples.add(new Person("홍길동", 10));
    peoples.add(new Person("홍길서", 20));
    peoples.add(new Person("홍길남", 30));
    peoples.add(new Person("홍길북", 25));

    System.out.println(peoples.toString());

    System.out.println("나이가 가장 많은 사람: " + peoples.last());

  }
}
