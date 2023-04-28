package com.kh.day2;
/*
    구구단중 2단을 출력하는 프로그램 작성하시오
    2 * 1 = 2
    2 * 2 = 4
    ...
    2 * 9 = 18
 */
public class Test9 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        for (int i = 2; i <= 9; i++) {
            System.out.println("=====" + i + "단==========");
            method2(i);
        }
    }

    public static void method2(int dansu) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(dansu + " * " + i + "=" + ( dansu * i));
        }
    }
}
