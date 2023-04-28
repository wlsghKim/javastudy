package com.kh.day4;

public class Test5 {
    public static void main(String[] args) {
        method1(2);
    }

    private static void method1(int x) {
           //반환할게 없을때 void
        System.out.println("method1() 호출됨!");
        if (x % 2 == 0) {
            return;
        }
        System.out.println("here");
    }
}
