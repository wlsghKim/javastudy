package com.kh.day16.h;

import java.util.TreeSet;

public class Main4 {
  public static void main(String[] args) {
    TreeSet<Object> persons = new TreeSet<>(new MyComparator3());

    persons.add(new Person("홍길동", 20));
    persons.add(new Person("홍길동", 10));
    persons.add(new Person("홍길동", 15));
    persons.add(new Person("홍길남", 20));

    System.out.println(persons);
  }
}
