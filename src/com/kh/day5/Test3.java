package com.kh.day5;

public class Test3 {
    public static void main(String[] args) {
        int sum =0;
        int sum2 =0;
        int sum3 =1;
        int sum4 =1;

        for (int i =1; i<=10; i++){
        //    sum = sum + 1;
            sum += i; // sum = sum + 1;
            sum2 -= i; // sum = sum2 - 1;
            sum3 *= i; // sum = sum3 * 1;
            sum4 /= i; // sum = sum4 / 1;
        }
        System.out.println("sum = " + sum);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}
