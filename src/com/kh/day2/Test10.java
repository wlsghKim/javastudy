package com.kh.day2;
/*
    구구단중 2단을 출력하는 프로그램 작성하시오
    2 * 1 = 2
    2 * 2 = 4
    ...
    2 * 9 = 18
 */
public class Test10 {
    public static void main(String[] args) {

        method1();
    }

    public static void method1() {
        for (int i= 2; i<= 4; i++) {
            System.out.println("=====" + i + "단==========");
        for (int j= 1; j<= 4; j++) {
            System.out.println( i + "*" + j + "=" + (i*j));
    }
   }
  }
}
