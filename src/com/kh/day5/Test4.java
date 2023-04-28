package com.kh.day5;

public class Test4 {
    public static void main(String[] args) {
        method1();
        System.out.println("------");
        method2();
        System.out.println("------");
        method3();
    }
    public static void method1() {
        int i = 10;
        int y = ++i;

        System.out.println("i=" + i);
        System.out.println("y=" + y);
    }

    public static void method2() {
        int i = 10;
        int y = i++;

        System.out.println("i=" + i);
        System.out.println("y=" + y);
    }

    public static void method3() {
        int i = 10;
        i++;
        System.out.println("i=" + i);

        int y =10;
        ++y;  //  y = y + 1
        System.out.println("y=" +y);
    }
}