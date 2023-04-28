package com.kh.day3;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> 사칙연산 프로그램 <<");
        boolean stop = false;
        while (!stop) {
            System.out.println("=======================================");
            System.out.println("메뉴 : 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.종료");
            System.out.println("========================================");
            System.out.println("선택 > ");
            int menu = Integer.parseInt(scanner.nextLine());

            String op1 =""; //피연산자1
            String op2= ""; //피연산자2
            int val1=0;
            int val2=0;

            {
                switch (menu) {
                    case 1:// 덧셈
                        System.out.print("피연산자1 >");
                        op1 = scanner.nextLine();
                        val1 = Integer.parseInt(op1);

                        System.out.print("피연산자2 >");
                        op2 = scanner.nextLine();
                        val2 = Integer.parseInt(op2);

                        System.out.println("결과=" + (val1 + val2));
                        break;

                    case 2: // 뺄셈
                        System.out.print("피연산자1 >");
                        op1 = scanner.nextLine();
                        val1 =Integer.parseInt(op1);

                        System.out.print("피연산자2 >");
                        op2 = scanner.nextLine();
                        val2 =Integer.parseInt(op2);

                        System.out.println("결과=" + (val1-val2));
                        break;

                    case 3: //곱셈

                        System.out.print("피연산자1 >");
                        op1 = scanner.nextLine();
                        val1 =Integer.parseInt(op1);

                        System.out.print("피연산자2 >");
                        op2 = scanner.nextLine();
                        val2 =Integer.parseInt(op2);

                        System.out.println("결과=" + (val1*val2));
                        break;

                    case 4: //나눗셈

                        System.out.print("피연산자1 >");
                        op1 = scanner.nextLine();
                        val1 =Integer.parseInt(op1);

                        System.out.print("피연산자2 >");
                        op2 = scanner.nextLine();
                        val2 =Integer.parseInt(op2);

                        System.out.println("결과=" + (val1 / val2));
                        break;

                    case 5: //종료
                        stop = true;
                    default:
                }
            }
        }
          System.out.println("프로그램 종료!!");
    }
}