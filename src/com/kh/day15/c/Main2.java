package com.kh.day15.c;

public class Main2 {
  public static void main(String[] args) {
    method1();
    method2(2);
  }

  //일반예외: Checked Exception
  //반드시 예외 처리 해줘야한다.
  //1.메소드 내부에서 2.호출한 메소드에 위임
  public static void method1() {
//    Thread.sleep(1000)  //밀리세컨즈 : 1000 -> 1초
    try {
      for (int i = 0; i < 10; i++) {
        Thread.sleep(100);
        System.out.println("i=" + i);
      }
    } catch (InterruptedException e) {

    }
  }

  public static void method2(int param) {

    if(param == 1) {
      throw new IllegalArgumentException("파라미터 오류"); //unchecked exception
    }   //unchecked exception은 처리를 안해주면...
    if(param == 2) {
//      throw new Exception("파라미터 오류");    //checked exception
    }   //checked exception은 꼭 예외를 처리해 줘야한다.
    System.out.println("param=" + param);
  }
}