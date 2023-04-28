package com.kh.day7;

import java.util.Scanner;

/*
* 영화관 좌석을 선택하세요 (1~60, 0:종료)
* 1.예약된 좌석은 'X'로 표시
* 2. 예약된 좌석을 예매하려고 할때 '이미 예매되었습니다' 라는 메시지 출력하고
*    다른 좌석을 선택하도록 유도한다.
* */
public class Test10 {
  public static void main(String[] args) {

    String[][] seats = new String[6][10];

    int seatNum = 0;
    for (int i = 0; i < seats.length; i++) {
      for (int j = 0; j < seats[i].length; j++) {
        seats[i][j] = ++seatNum + "";
      }
    }

    //좌석 출력
    for (int i = 0; i < seats.length; i++) {
      for (int j = 0; j < seats[i].length; j++) {
        System.out.printf("%3s", seats[i][j]);
      }
      System.out.println();
    }

    int seat = 17;
    int row = (seat-1) / 10;
    int column = (seat-1) % 10;
    seats[row][column] = "X";

    Scanner scanner = new Scanner(System.in);
    System.out.println("------------------------------");
    System.out.println("좌석 선택>>");
    String Num = scanner.nextLine();

    }
  }

