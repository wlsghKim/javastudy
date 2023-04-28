package com.kh.day2;
/*
      학점 구하기
 */
public class Test4 {
    public static void main(String[] args) {
        int score = 95;

        int result = score / 10;

//        System.out.println(score * 1.0 / 10 );
//      System.out.println((double)score / 10 );
//        System.out.println(score / (double)10 );

//       switch(result){     //값

//     switch (share(score) ){ //식

        int result2 = share(score);
        switch (result2) {

            case 9:
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");
                break;
            case 7:
                System.out.println("C학점");
                break;
            case 6:
                System.out.println("D학점");
                break;
            default:
                System.out.println("F학점");
        }
    }

    public static int share(int value) {
        int result = 0;

        result = value / 10;

        return result;
    }

}
