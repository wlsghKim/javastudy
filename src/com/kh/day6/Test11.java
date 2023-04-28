package com.kh.day6;

public class Test11 {
public static void main(String[] args) {

    method1();
    System.out.println();
    System.out.println("---------------");
    method2();
    }

    public static void method2() {
        int[] arr = new int[]{10, 20, 15};

        int max = arr[0];
        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }
        }
        System.out.printf("최대값:%d\n", max);
    }

    public static void method1() {

        int x = 10;
        int y = 20;
        int z = 15;

        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        System.out.printf("최대값:%d", max);
        }
    }
