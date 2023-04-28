package com.kh.day3;

import java.util.Scanner;

/*
* 2개의 정수를 입력받아 사칙연산을 수행하는 프로그램을 작성하시오.
* 1. 사칙연산 선택
* 2. 2개의 정수를 입력받아 사칙연산수행
* 3. 계속여부에 따라 프로그램이 유지 또는 종료될 수 있다.
* 종료: 'X' 를 입력시 프로그램 종료
*/
public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> 사칙연산 프로그램 <<");
        System.out.println("메뉴 : 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.종료");
        int menu = Integer.parseInt(scanner.nextLine());
        System.out.println("<< 2개의 정수를 입력받아 사칙연산수행");
        boolean stop = false;
        while (!stop) {

            System.out.print("숫자(1) 입력");
            int x = Integer.parseInt(scanner.nextLine());

            System.out.print("숫자(2) 입력");
            int y = Integer.parseInt(scanner.nextLine());


            switch (menu) {
                case 1:
                    System.out.println(x + "+" + y + "=" + (x + y));
                    break;

                case 2:
                    System.out.println(x + "-" + y + "=" + (x - y));
                    break;

                case 3:
                    System.out.println(x + "*" + y + "=" + (x * y));
                    break;
                case 4:
                    System.out.println(x + "/" + y + "=" + (x / y));
                    break;

                case 5:
                    stop = true;
                    break;

                default:
                    break;
            }

            System.out.println("계속하시겠습니까?(Y/N)");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("Y")) {
                stop = true;

            }
        }
    }
}