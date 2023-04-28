package com.kh.day9.a;

/*
 * 라이브러리 클래스 : 실행메소드(main())가 없는 클래스
 */

public class Caculator {
  public int field1;
  public double field2;
  public String field3;
  public static Battery field4;   //java에선 메소드를 필드라 불림

  public void method1() {
    System.out.println("method1() 호출됨!");
  }

  public void method2() {
    System.out.println("method2() 호출됨!");
  }

  public void method3() {
    System.out.println("method3() 호출됨!");
  }

  public static void method4() {
    System.out.println("method4() 호출됨!");
  }
}
