
package com.kh.day3;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        // 참조타입 = Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("<< 3개의 정수값을 입력받아 최대값 구하기");
        boolean stop =false;

        while (!stop) {

            System.out.print("정수1 : ");
            int x = Integer.parseInt(scanner.nextLine());
            System.out.print("정수2 : ");
            int y = Integer.parseInt(scanner.nextLine());
            System.out.print("정수3 : ");
            int z = Integer.parseInt(scanner.nextLine());

            int max = x;
            if (y > max) {
                max = y;
            }
            if (z > max) {
                max = z;
            }

            System.out.println("최대값=" + max);
            System.out.println("계속하시겠습니까?(Y/N)");
            String answer = scanner.nextLine();
//          if(answer.equals("Y") || !answer.equals("y")) {
            if (!answer.equalsIgnoreCase("Y")) {
                stop = true;
            }
        }
    }
}