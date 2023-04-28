package com.kh.day7;

public class Test4 {
    public static void main(String[] args) {

        int[][][] arr = new int[2][4][3];

        //일반 for문
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("------------");

        // 향상된 for문
        for (int[][] height : arr) {
            for (int[] row : height) {
                for (int column : row) {
                    System.out.print(column);
                }
                System.out.println();
             }
            System.out.println();
        }
    }
}