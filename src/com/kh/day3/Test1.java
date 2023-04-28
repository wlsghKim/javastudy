package com.kh.day3;


//        초기화식
//        while(조건식){
//         증감식
//        }
//    }

     public class Test1 {
         public static void main(String[] args) {
          sumByFor();
             System.out.println("-------");
         sumByWile();
             System.out.println("-------");
             sumByDoWhile();
         }

             // 1~10 까지의 합구하기(for)
             // for :반복횟수를 알때
             public static void sumByFor(){
                 int sum = 0;
                 for (int i = 1; i <= 10; i++){
                 sum = sum + i;
             }
             System.out.println("합계="+sum);
         }

         // 1~10까지의 합구하기(while)
         // while : 반복횟수를 유동적일때
         public static void sumByWile(){
             int i = 1;
             int sum = 0;
             while (i <= 10) {
                sum = sum +i;
                i++;
             }
             System.out.println("합계=" + sum);
         }

         //1~10까지의 합구하기(do~while)
         public static void sumByDoWhile(){
             int i = 1;
             int sum = 0;
             do {
                 sum = sum + i;
                 i++;
             }while(i <= 10);
             System.out.println("합계="+sum);
             }
         }