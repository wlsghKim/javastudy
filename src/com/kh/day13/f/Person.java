package com.kh.day13.f;

import java.util.Objects;

public class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
//alt+insert  - equals and hash code
  @Override
  public boolean equals(Object o) {
    //재정의한 이유
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age && Objects.equals(name, person.name);
  }     //내용비교
  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }
  //  @Override
//  public boolean equals(Object obj) {
//    boolean flag = false;
//    if(obj instanceof  Person) {
//      Person person = ((Person) obj);
//      if (this.name.equals(person.name)&& this.age == person.age) {
//        flag = true;
//      }
//    }
//    return flag;
//  }
}

