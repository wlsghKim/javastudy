package com.kh.day5;
/*
*  논리연산자 쇼트 서킷
* */
public class Test8 {
    public static void main(String[] args) {
       method1();
        System.out.println("--------------------");
       method2();
    }

    public static void method1() {
        int x = 0;
        int y = 0;
        if (5 < 1 && x++ > y) {
            y++;
        }
        System.out.println("x=" + x + "y=" + y);

    }

    public static void method2() {
        int x = 0;
        int y = 0;
        if (5 < 1 || x++ > y) {
            y++;
        }
        System.out.println("x=" + x + "y=" + y);

    }
}
