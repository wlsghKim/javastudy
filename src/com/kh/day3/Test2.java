package com.kh.day3;
/*
     3개의 정수값을 비교하여 최대값을 구하는 프로그램을 작성하시오.
*/
public class Test2 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int z = 4;
        int a = 6;

        int max = x;
        if( y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        if (a > max) {
            max = a;
        }
        System.out.println("최대값=" + max);
    }
}