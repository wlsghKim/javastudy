package com.kh.day6;

public class Test2 {
    public static void main(String[] args) {
        int[][] array = new int[3][4];

        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[0][0]);
        System.out.println(array[0][1]);
        System.out.println(array[0][2]);
        System.out.println(array[0][3]);

        System.out.println(array[1][0]);
        System.out.println(array[1][1]);
        System.out.println(array[1][2]);
        System.out.println(array[1][3]);

        System.out.println(array[2][0]);
        System.out.println(array[2][1]);
        System.out.println(array[2][2]);
        System.out.println(array[2][3]);

        System.out.println("=============");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}