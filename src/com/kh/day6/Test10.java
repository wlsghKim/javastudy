package com.kh.day6;

import java.util.Scanner;

/*
* 2개의 정수로 합을 구하는 프로그램을 작성하시오.
* 이때 2개 정수의 합은 별도 메소드를 구현한다.
* */
public class Test10 {
    public static void main(String[] args) {
        int result = sum(10, 20);
        System.out.println("result=" + result);

        result = sum(10, 20, 30);
        System.out.println("result=" + result);

        sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("result=" + result);
    }

//    // 2개의 정수합
//    public static int sum(int x, int y) {
//        int result = 0;
//        result = x + y;
//        return result;
//    }
//
//    //3개의 정수합
//    public static int sum(int x, int y, int z) {
//        int result = 0;
//        result = x + y + z;
//        return  result;
//    }

    //가변 매개 변수 (...) : 메소드 내에서는 배열처럼 사용된다.
    public static int sum(int... x) {
        int result = 0;
        System.out.println(x.length);
        // 일반 for문
//        for (int i = 0; i < x.length; i++) {
//            System.out.println(x[i]);
//            result += x[i]; //result = result + x[i]
//        }
        // 향상된 for문
        for (int ele : x) {
           result += ele;
        }
        return result;
    }
}
