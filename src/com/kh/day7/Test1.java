package com.kh.day7;

public class Test1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int result = sum(x, y);

    }

    public static int sum(double x, double y) {

        int result = 0;
        result = (int)(x + y);
        return  result;
    }

    public static void method1() {
        sum( 10, 20);
    }
}