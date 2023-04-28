package com.kh.day5;

public class Test9 {
    public static void main(String[] args) {
        byte x = 127; // byte : -128 ~ 127
        System.out.println("x=" +x);

        x += 1; // x = x + 1;
        System.out.println(x);

        x = -128;
        x -= 1; // x = x - 1;
        System.out.println(x);

        int y = x + 1;
        System.out.println("y=" + y);

        int z = x + 1;
        System.out.println("y=" + y);

        byte a = 5;
        byte b = 5;
        int c = a + b;
        byte d = (byte)(a + b);
        System.out.println("d="+d);
    }
}
