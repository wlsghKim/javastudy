package com.kh.day13.c;

public class Main3 {
  public static void main(String[] args) {

    Person person = new Person();
    Student student = new Student();
    Teacher teacher = new Teacher();
    HighStudent highStudent = new HighStudent();

    Person[] persons = new Person[4];
    persons[0] = person;
    persons[1] = student;
    persons[2] = teacher;
    persons[3] = highStudent;

    for (Person p : persons) {
   //   p.eat();

      if (p instanceof HighStudent) {
        ((HighStudent)p).eat();
        ((HighStudent)p).study();
        ((HighStudent)p).testSat();
      } else if (p instanceof Student) {
        ((Student)p).eat();
        ((Student)p).study();
      } else if (p instanceof Teacher) {
        ((Teacher)p).eat();
        ((Teacher)p).teach();
      } else if (p instanceof Person) {
        p.eat();
      }
    }
  }
}
