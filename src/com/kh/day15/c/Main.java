package com.kh.day15.c;

public class Main {
  public static void main(String[] args) {
    //ArrayIndexOutOfBoundsException
    int[] a = new int[3];
//    a[0] = 10;
//    a[3] = 20;

    //NullPointException
    a = null;
//    a[0] = 10;

    //ArithmeticException
    try {
      System.out.println(10 / 0);
      //Exception 만나면 프로그램을 비정상 종료시킨다
    } catch (ArithmeticException e) {
//      e.printStackTrace();
//      System.out.println(e.getMessage());  //원인
//      System.out.println(e.getCause());   // 반환타입이 문자열
//      ArithmeticException e2 = new ArithmeticException("나누기오류");
//      System.out.println(e2.getMessage());
      return;
    }finally {  //return이 있어도 실행된다.
      System.out.println("finally 절 실행됨!");
    }
    System.out.println("프로그램 종료!");
  }
}
