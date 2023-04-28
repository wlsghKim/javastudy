package com.kh.day3;

public class Test3 {
    public static void main(String[] args) {
        int x =10;
        int y =20;
        int z;
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("-------------");
        z = x;
        x = y;
        y = z;
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
