package com.kh.day4;

public class Test2 {
    public static void main(String[] args) {
        int x = 10;      //값
        int y = x;       //변수
        int z = x + y + 5; //연산식
        int k = sum(x, y); //메소드호출

        System.out.println("k=" +k);

        boolean stop = false;

        //  if (true) {    //값
        //  if (stop) {    //변수
        // if(x % 2 == 0)  //연산식
        if (method()) {   //메소드호출
            System.out.println("짝수");
        }else {
            System.out.println("홀수");

        }
    }

    public static int sum(int x, int y) {
        int result = 0;
        result = x + y;
        return result;
    }


    public static boolean method() {
        boolean flag = true;
 //  return true;       //값
 // return flag;       //변수
 //return true && true;  //연산식

        return method2();  //메소드 호출
    }

    public static boolean method2() {
        return true;
    }

}