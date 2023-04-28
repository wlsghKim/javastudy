package com.kh.day13.c;

public class Main {
  public static void main(String[] args) {
    HighStudent s = new HighStudent();
    s.testSat();
    s.eat();
    s.study();
    //up casting
    ((Student)s).study();
    ((Student)s).eat();
    //up casting
    ((Person)s).eat();
    //up casting
    ((Object)s).toString();


    Student s2 = new HighStudent();
    //s2 관점으로 형변환 되어 student 역할만 가능
    s2.eat();
    s2.study();
    // down casting
    ((HighStudent)s2).testSat();

    Person p1 = new Student();

    // down casting(o)
    ((Student)p1).study();
    // down casting(x)
    // Student관점으로 다운캐스팅하여 문법은 가능하나 실체의 결과는 불가
    ((HighStudent)p1).study();
  }
}
