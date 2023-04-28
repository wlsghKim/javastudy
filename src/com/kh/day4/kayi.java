package com.kh.day4;

import java.util.Random;
import java.util.Scanner;

public class kayi {
    public static void main(String[] args) {
        Random rd =new Random();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int com = rd.nextInt();
            if (com < 0) com *= -1;
            com = com %3+1;

            System.out.printf("선택하세요(0 입력시 종료) \n  (1)가위 (2)바위 (3)보자기 ");
            int user = sc.nextInt();

            if (user == 0) break;

            if (com == 1) System.out.printf("컴퓨터 : %s\t\t ", "가위");
            else if (com == 2) System.out.printf("컴퓨터 : %s\t\t ", "바위");
            else System.out.printf("컴퓨터 : %s\t\t ", "보자기");

            if (user == 1) System.out.printf("나 : %s\t\t ", "가위");
            else if (com == 2) System.out.printf("나 : %s\t\t ", "바위");
            else System.out.printf("나 : %s\t\t ", "보자기");

            if (com == user) System.out.printf("무승부 입니다. \n");
            else if (com == 1 && user == 2) System.out.printf("이겼습니다 \n");
            else if (com == 2 && user == 3) System.out.printf("이겼습니다 \n");
            else if (com == 3 && user == 1) System.out.printf("이겼습니다 \n");
            else System.out.printf("졌습니다. \n");
        }
        System.out.printf("가위바위보 게임 종료!!");
            }
        }
