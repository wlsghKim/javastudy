package com.kh.day1;

public class PrintStart {
  public static void main(String[] args) {
        printChar('@', 3); //***
//        System.out.println('*');
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");
//
//        System.out.println('@');
//        System.out.println("@@");
//        System.out.println("@@@");
//        System.out.println("@@@@");
    }
    // 화면에 출력할 문자와 갯수를 입력받아 출력하는 기능을 수행하는 메소드
    public static void printChar(char c, int cnt) {
        //반복문
      for (int i = 1; i <= cnt; i++){  // i++ : i = i + i

        System.out.print(c);

      }
    }
 }