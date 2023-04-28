package com.kh.day2;
/*
* 국, 영, 수 총점과 평균을 구하시오
 */

public class Test5 {
    public static void main(String[] args) {
        method1();
        printLine('-', 30);
        method2();
        printLine('-', 30);

    }
        public static void printLine(char c , int cnt){
        for(int i=0; i<cnt; i++){
            System.out.print(c+"");
        }
            System.out.println();
        }

    public static void method1() {
        double kor = 80;

        double eng = 70;

        double math = 65;

        System.out.println("총점" + (kor + eng + math));
        System.out.println("평균" +((kor + eng + math)/3));
//        System.out.println("평균" + ((double) (kor + eng + math) / 3));
    }

    public static void method2() {
        int kor = 80;
        int eng = 70;
        int math = 65;

        int sum = kor + eng + math;
        double avg = (double) sum / 3;

        System.out.println("총점" + sum);
        System.out.println("평균" + (double)sum/3);
    }
        public static void method3(){
            int kor, eng, math, sum;
            double avg;

            kor = 80;
            eng = 70;
            math= 65;

            sum = kor + eng + math;
            avg = (double)(sum / 3);
        }
    public static void method4(){
        int kor, eng, math, sum;
        double avg;

        kor = 80;
        eng = 70;
        math= 65;

        sum = sum(kor, eng, math);
        avg = avg(sum, 3);
//        avg = avg(sum(kor, eng, math), 3);
    }
     // 3개의 정수값을 입력받아 합계를 반환하는 메소드
    public static int sum(int val1, int val2, int val3) {
        int result = 0;
        result = val1 + val2 + val3;
        return result;
    }

     // 2개의정수(나누어지는 값과 나눌값)를 입력받아 계산결과를 반환하는 메소드
    public static double avg(int val1, int val2){
        double result =0.0;
        result = val1 / (double)val2;
        return result;
    }
}

