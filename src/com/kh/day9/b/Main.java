package com.kh.day9.b;

import com.kh.day9.a.Caculator;

/*
 * 실행클래스 : main()가 메소드가 있는 클래스
 * */
public class Main {

  public static void main(String[] args) {
    Caculator cal = new Caculator();
    cal.method1();
    cal.method2();
    cal.method3();

    Caculator.method4();
    Math.random();

    System.out.println("hello");
    Caculator.field4.method1("hello");
  }
}
