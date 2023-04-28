package com.kh.day14.a;

public class Main2 {
  public static void main(String[] args) throws CloneNotSupportedException {
    Person p1 = new Person("홍길동", 30);
    System.out.println(p1.name);
    System.out.println(p1.age);

    Person cloneOfp1 = (Person)p1.clone();
    System.out.println(cloneOfp1.name);
    System.out.println(cloneOfp1.age);

    //주소비교
    System.out.println(p1 == cloneOfp1);
    //내용비교
    System.out.println(p1.equals(cloneOfp1));
    System.out.println(p1.hashCode() == cloneOfp1.hashCode());
  }
}
