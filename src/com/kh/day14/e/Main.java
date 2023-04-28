package com.kh.day14.e;

public class Main {
  public Main() {
    super();
  }

  public static void main(String[] args) {
    Person p1 = new Student();
    p1.eat();
    p1.smile();

    Student s1 = (Student) p1;
    s1.eat();
    s1.smile();

    Student s2 = new Student();
    s2.eat();
    s2.smile();

    Person p2 = new Person() {
      @Override
      public void eat() {
        System.out.println("먹다");
        study();
      }

      public void study() {
        System.out.println("공부하다");
      }
    };

    Person p3 = new Person() {
      @Override
      public void eat() {
        System.out.println("먹다");
        teach();
      }

      void teach() {
        System.out.println("가르치다");
      }
    };
    p3.eat();

    Person p4 = new Person() {
      @Override
      public void eat() {

      }
    };
    p4.eat();
    p4.smile();
  }
}