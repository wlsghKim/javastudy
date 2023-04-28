package com.kh.day3;

import java.util.Scanner;

/*
 *  사용자로부터 단수를 입력받아 구구단 출력하는 프로그램을 작성하시오
 */
public class Test5 {
    public static void main(String[] args) {
        method1(); //while문

        method2(); //do~while문
    }

        // while문 사용
      public static void  method1() {
          Scanner scanner = new Scanner(System.in);
          System.out.println(">>구구단 출력<<");

          boolean stop = false;
          while (!stop) {
              System.out.print("단수 입력(입력:2~9, 종료:'X') > ");
              String input = scanner.nextLine();
              if (input.equalsIgnoreCase("x")) {
                  stop = true;
                  continue;
              }
              int dansu = Integer.parseInt(input);
              for (int i = 1; i <= 9; i++) {
                  System.out.println(dansu + " * " + i + "= " + (dansu * i));
              }
          }

          System.out.println("프로그램 종료!");
      }

        // do~while문 사용
        public static void method2() {
           Scanner scanner = new Scanner(System.in);
            System.out.println(">>구구단 출력 프로그램<<");
               boolean stop = false;
               do{
                System.out.print("단수 입력(입력:2~9, 종료:'X') > ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("x")) {
                    stop = true;
                    continue;
                    }
                    int dansu = Integer.parseInt(input);

                    for (int i = 1; i <= 9; i++) {
                            System.out.println(dansu + " * " + i + "= " + (dansu * i));
                        }
                    } while(!stop);

                    System.out.println("프로그램 종료!");
            }
       }