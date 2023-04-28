package com.kh.day1;

public class IfTest {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= 10; i++) {
            if( i % 2 == 0 ){
                evenSum = evenSum + i;
            }else{
                oddSum = oddSum + i;
            }
        }
        System.out.println("1부터 10까지 짝수 합=" + evenSum);
        System.out.println("1부터 10까지 홀수 합=" + oddSum);
    }
}