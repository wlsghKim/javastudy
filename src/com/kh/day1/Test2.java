package com.kh.day1;

public class Test2 {
    public static void method1() {
        System.out.println("method1()호출됨");
        method2();
    }
    public static void method2() {
        System.out.println("method2 ()호출됨");
    }

    public static void main(String [] args) {
        System.out.println("hello~");
        method1();
        method2();
        method2();
        method2();
    }
}