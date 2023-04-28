package com.kh.day16.e;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    HashSet<Person> persons = new HashSet<>();

   persons.add(new Person("홍길남", 30));
   persons.add(new Person("홍길순", 40));
   persons.add(new Person("홍길남", 50));
   persons.add(new Person("홍길남", 50));

    System.out.printf("%s %d",  persons.toString(), persons.size());

      //iterator를 사용하여 요소를 순차적 접근
    Iterator<Person> persons2 = persons.iterator();
    while(persons2.hasNext()){
      Person person = persons2.next();
      System.out.println(person);
    }

    //향상된 for문
    for (Person person : persons){
      System.out.println(person);

    }
  }
}
