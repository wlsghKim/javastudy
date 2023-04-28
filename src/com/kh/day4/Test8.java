package com.kh.day4;

import java.util.Scanner;

/*
* 가위바위보 게임을 구현하시오
* Math.random(): 0.0 <= 실수값 <1.0
* */
public class Test8 {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            int x = (int) (Math.random() * 45) + 1;
            System.out.println(x);
        }
    }
 }
        /*Scanner scanner = new Scanner(System.in);
        System.out.println(">>가위바위보 게임<<");
        System.out.print("1.가위 2.바위 3.보 중 하나를 고르시오");
        int x = (int) (Math.random() * 3 + 1);
        System.out.println();
        System.out.println("선택 >");
        // "가위"
        String str ="가위";
        String str2="바위";
        String str3="보";

        if(str.equals("가위")) {
            System.out.println("참");
        }else {
            System.out.println("다르다");

        if(str2.equals("바위")) {
            System.out.println("참");
        }else {

        if(str3.equals("보")) {
            System.out.println("참");
        }else {

            int menu = Integer.parseInt(scanner.nextLine());
*/
