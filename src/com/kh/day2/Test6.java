package com.kh.day2;
//    for (초기화식; 조건식; 증감식;){
//        실행문1;
//        실행문2;
//     }
public class Test6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            sum = sum + i;
        }
        System.out.println("합계" + sum);
//      i <= 3 비교연산자 참이면 밑에 중괄호를 진행하고 다시 식을 반복
//      0+1 , 1+1 , 2+1 <=3 참   3+1 은 거짓으로 중단
//      System.out.println("i="+i);
    }
}
