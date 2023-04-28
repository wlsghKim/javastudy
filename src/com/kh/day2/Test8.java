package com.kh.day2;

public class Test8 {
    public static void main(String[] args) {
       method1();
       method2();
    }

    // 1부터 10까지 순회중 값이 5인경우 반복문 빠져나오기
    public static void method1() {

        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // 반복문에 사용될때 가장 가까운 반복문 1개를 빠져나온다
            }
            System.out.println("i=" + i);
        }
        System.out.println("method1()종료");
    }
    // 1부터 10까지 순회중 값이 5인경우만 제외하기
    public static void method2() {
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                continue; // 반보군에서 사용되며 증감식으로 이동한다.
            }
            System.out.println("i="+i);
        }
        System.out.println("method2()종료");
    }
}