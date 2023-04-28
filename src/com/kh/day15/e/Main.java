package com.kh.day15.e;

public class Main {
  public static void main(String[] args) {
    //    method2();
    try{
    deposit(0);
  } catch (UserException1 e1){
    System.out.println(e1.getMessage());
  } catch (UserException2 e2){
    System.out.println(e2.getMessage());
  } catch (Exception e3) {
      System.out.println(e3.getMessage());
    }finally {
      System.out.println("예외 상관없이 처리됨!");
    }
    System.out.println("프로그램 종료!");
  }

  static void method2() {
    try {
      method1();
    } catch (Exception e) {

    }
  }
  static void method1() throws  ArrayIndexOutOfBoundsException {
    int[] arrays = new int[3];

//    try {
      System.out.println(arrays[3]);
//    } catch (Exception e) {
//    }

  }

  static void deposit(int money) {
    if(money > 40_000){
      throw new UserException1("1회 입금은 4만원을 초과할 수 없습니다");
    }
    if (money < 1) {
      throw new UserException2("1원보다 작은 금액을 입금할 수 없습니다");
    }
  }
}

