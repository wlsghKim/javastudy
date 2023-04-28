package com.kh.day5;

public class Test7 {
    public static void main(String[] args) {
        System.out.println( 3 | 5);
        System.out.println( 3 & 5);
        System.out.println( 3 ^ 5);

        int x = 3; // 00000011

        int y = x >> 1; // 00000001
        System.out.println("y=" + y);
        int z = x << 1; // 00000110
        System.out.println("z=" + z);


    }
}
