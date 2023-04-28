package com.kh.day6;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int[] array = new int [2];
        array[0] = 1;
        array[1] = 2;
        System.out.println(Arrays.toString(array));

        System.out.println("------------");
        int[] array2 = new int[]{1, 2};
        System.out.println(Arrays.toString(array2));

        System.out.println("------------");


        int[][] array3 = new int[2][2];
        array3 [0][0] =1;
        array3 [0][1] =2;

        array3 [1][0] =3;
        array3 [1][1] =4;

        System.out.println(Arrays.toString(array3[0]));
        System.out.println(Arrays.toString(array3[1]));

        System.out.println("------------");

        int[][] array4 = new int[][]{
                {1, 2},
                {3,4}
        };
        System.out.println(Arrays.toString(array4[0]));
        System.out.println(Arrays.toString(array4[1]));

        System.out.println("------------");

        int[][][] array5 = new int[][][]{ //[높이][행][열]
                {
                {1, 2},
                {3, 4}
        },
        {
                {5, 6},
                {7, 8}
        },
    };
        System.out.println(Arrays.toString(array5[0][0]));
        System.out.println(Arrays.toString(array5[0][1]));
        System.out.println(Arrays.toString(array5[1][0]));
        System.out.println(Arrays.toString(array5[1][1]));
    }
}