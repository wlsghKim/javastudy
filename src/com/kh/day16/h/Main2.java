package com.kh.day16.h;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Main2 {
  public static void main(String[] args) {
    TreeSet<Person> persons1 = new TreeSet<Person>(new MyComparator1());
    persons1.add(new Person("홍길동", 10));
    persons1.add(new Person("홍길서", 20));
    persons1.add(new Person("홍길남", 30));
    persons1.add(new Person("홍길북", 25));
    System.out.println(persons1);


    TreeSet<Person> persons2 = new TreeSet<Person>(new MyComparator2());
    persons2.add(new Person("홍길동", 10));
    persons2.add(new Person("홍길서", 20));
    persons2.add(new Person("홍길남", 30));
    persons2.add(new Person("홍길북", 25));
    System.out.println(persons2);
  }
}
