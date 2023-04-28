package com.kh.day2;

public class Test7 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    // 1부터 10까지의 합을 구하시오
    public static void method1() {
        int sum = 0;
        for (int i = 10; i >= 1; i--) {
            sum = sum + i;
        }
        System.out.println("1부터 10까지의 합 :" + sum);
    }

    // 1부터 10까지 홀수의 합을 구하시오
    public static void method2() {
        int sum = 0;
        // case1)
//        for (int i = 1; i<=10; i++) {
//            sum = sum + i;
//        }
//        }
        //case2)
        for (int i = 1; i <= 10; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("1부터 10까지의 합" + sum);
    }
}
