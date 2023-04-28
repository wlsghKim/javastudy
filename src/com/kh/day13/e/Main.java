package com.kh.day13.e;

public class Main {
  public static void main(String[] args) {
    Student student = new Student();
//    student.name = "홍길동";
    System.out.println(student.name);
    student.eat();

    System.out.println(((Person)student).name);
    //필드에선 재정의가 일어나지 않아 홍길동
    ((Person)student).eat();
    //재정의는 메소드에서 일어나 먹다가 맛있게 먹다로 바뀜

    System.out.println(Student.age);
    System.out.println(Person.age);

    System.out.println(student.age);
    System.out.println(((Person)student).age);
    //필드는 재정의 대상이 아님 메소드가 재정의 대상

  }
}
