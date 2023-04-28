package com.kh.day1;

public class Test3 {
    public static void main(String[] args) {
        int x = 5;  // 변수 선언 + 초기화

        System.out.println((x % 2) == 0);
        if (x % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        int y = 75;
        if (y >= 90) {
            System.out.println("A학점");
        } else if (y >= 80) {
            System.out.println("B학점");
        } else if (y >= 70) {
            System.out.println("C학점");
        } else if (y >= 60) {
            System.out.println("D학점");
        } else {
            System.out.println("F학점");
        }
    }
}
