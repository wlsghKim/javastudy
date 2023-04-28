package com.kh.day5;

public class Test14 {
    public static void main(String[] args) {
    method1();
        System.out.println("------------");
    method2();

    }
    public static void method1 (){
        int kor = 90;
        int eng = 80;
        int math =70;

        int sum = kor + eng + math;
        double avg = sum/ (double)3;

        System.out.println("합계=" + sum );
        System.out.println("평균=" + avg);
    }

    // 배열
    public static void method2(){
        int [] subject; //정수형 배열 선언
        subject = new int [3];
        subject[0] =90; //kor
        subject[1] =80; //eng
        subject[2] =70; //math


//        int sum = subject[0] + subject[1] + subject[2];
//       double avg = sum / 3;
        int sum =0;
        for (int i = 0; i < subject.length; i++) {
            sum += subject[3];  // sum = sum +subject[i]
        }
        double avg = sum / (double)subject.length;
        System.out.println("sum=" + sum);
        System.out.println("avg=" + avg);
    }
}
