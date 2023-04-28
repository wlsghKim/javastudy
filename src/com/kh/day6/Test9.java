package com.kh.day6;

public class Test9 {
    public static void main(String[] args) {
        System.out.println();

        double x =3.14159;
        int y= 10;
        System.out.printf("원주율 %10.2f 반지름%d",x,y);  //format 출력포맷

        int a= 10;
        int b =20;
        int c =30;
        int sum = a+b+c;
        double avg = (double) sum / 3;

        System.out.println("합계=" + sum);
        System.out.println("평균=" + avg);

        System.out.printf("합계=%d , 평균=%5.2f\n", sum, avg);
        System.out.printf("합계=%d , 평균=%5.2f\n", sum, avg);
        System.out.printf("합계=%d\t평균=%5.2f", sum, avg);
      //method1();
    }

    public static int method1(int x, int y) {
        return x+y;

    }
    public static int method1(int x, int y, int z) {
        return x+y;
    }
    public static int method1(int x, int y, int z, int a) {
        return x + y;
    }
}