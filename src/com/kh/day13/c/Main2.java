package com.kh.day13.c;

import com.kh.day11.a.Test1;

public class Main2 {
  public static void main(String[] args) {
    Student s1 = new Student();
    Teacher t1 = new Teacher();
    HighStudent hs1 = new HighStudent();

    doEat(s1);
    doEat(t1);
    doEat(hs1);

    Person obj1 = s1;
    Person obj2 = t1;
    Person obj3 = hs1;
    obj1.eat();
    obj2.eat();
    obj3.eat();

    byte x = 10;
    short y = 20;
    int z = 30;

    callMethod(x);
    callMethod(y);
    callMethod(z);
  }

  static void doEat(Person obj) {
    //Person으로 받았기에 eat만 가능!
    obj.eat();
  }

  static void callMethod(double val) {
    System.out.println(val);
  }
}
