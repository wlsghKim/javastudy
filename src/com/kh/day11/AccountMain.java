package com.kh.day11;

import java.util.Scanner;

public class AccountMain {
  public static final int OPEN_ACCOUNT_LIMIT = 5;  //계좌개설 수 한도
  public static final int NOT_FOUND = -1;  //인덱스 못찾을 경우
  private static Account[] accounts;    //계좌를 담는 배열

  public static void main(String[] args) {

    //총 개설할 수 있는 계좌는 5개로 제한
    accounts = new Account[OPEN_ACCOUNT_LIMIT];

    Scanner scanner = new Scanner(System.in);
    boolean stop = false;
    while (!stop) {
      System.out.println("1.신규 2.폐지 3. 입금 4.출금 5.계좌조회(개별) 6.계좌조회(전체) 7.종료");
      System.out.print("선택 >> ");
      String menu = scanner.nextLine();

      int findedIndex = NOT_FOUND;        //인덱스 번호 : 없으면 -1
      String accountNumber = "";  //계좌번호
      int money = 0;              //입출금액

      switch (menu) {

        case "1":  //신규
          System.out.print("이름 > ");
          String accountName = scanner.nextLine();
          // 1) 계좌 개설 한도 체크
          findedIndex = findNullIndex();
          if (findedIndex == NOT_FOUND) {
            System.out.println("계좌 개설 한도가 모두 찼습니다.");
            continue;
          }
          // 2) 동명이인 체크
          if (dupChkAccountName(accountName)) {
            System.out.println("동명이인이 존재합니다.");
            continue;
          }
          accounts[findedIndex] = new Account(accountName);
          System.out.println(accountName + " 님의 계좌가 생성되었습니다!");
          System.out.println(accounts[findedIndex]);
          break;

        case "2":  //폐지
          System.out.print("계좌번호 > ");
          accountNumber = scanner.nextLine();
          // 1) 계좌번호 찾기
          findedIndex = findIndexOfAccount(accountNumber);
          if (findedIndex == NOT_FOUND) {
            System.out.println("찾고자하는 계좌가 없습니다.");
            continue;
          }
          // 2) 잔액체크
          if (accounts[findedIndex].getBalance() > 0) {
            System.out.println("잔액이 존재합니다");
            System.out.println(accounts[findedIndex]);
            continue;
          }
          // 3)폐지
          accounts[findedIndex] = null;
          break;

        case "3":  //입금
          System.out.print("계좌번호 > ");
          accountNumber = scanner.nextLine();
          // 1) 계좌번호 찾기
          findedIndex = findIndexOfAccount(accountNumber);
          if (findedIndex == NOT_FOUND) {
            System.out.println("찾고자하는 계좌가 없습니다.");
            continue;
          }
          // 2)입금
          System.out.println("입금액 > ");
          money = Integer.parseInt(scanner.nextLine());
          accounts[findedIndex].deposit(money);
          System.out.println(accounts[findedIndex]);
          break;


        case "4":  //출금
          System.out.println("계좌번호 > ");
          accountNumber = scanner.nextLine();
          // 1) 계좌번호 찾기
          findedIndex = findIndexOfAccount(accountNumber);
          if (findedIndex == NOT_FOUND) {
            System.out.println("찾고자하는 계좌가 없습니다.");
            continue;
          }
          // 2)출금
          System.out.println("출금액 > ");
          money = Integer.parseInt(scanner.nextLine());
          accounts[findedIndex].withdraw(money);
          System.out.println(accounts[findedIndex]);
          break;

        case "5":  //계좌조회(개별)
          System.out.println("계좌번호 > ");
          accountNumber = scanner.nextLine();
          // 1) 계좌번호 찾기
          findedIndex = findIndexOfAccount(accountNumber);
          if (findedIndex == NOT_FOUND) {
            System.out.println("찾고자하는 계좌가 없습니다.");
            continue;
          }
          System.out.println(accounts[findedIndex]);
          break;

        case "6":  //계좌조회(전체)
          printAllAccount();
          break;

      case "7":  //종료
        stop = true;
        continue;

      default: // 1~7 이외의 키 입력:
        break;
    }
  }
    System.out.println("프로그램 종료!");
}
//계좌 전체조회
  private static void printAllAccount() {
    int usingCount = 0; //사용중인 계좌수
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] == null) {
        continue;
      }
      usingCount++;
      System.out.println(accounts[i]);
    }
    System.out.println("사용중인 계좌수 : " + usingCount);
    System.out.println("잔여계자수 : " + (accounts.length - usingCount));
  }


  //계좌번호와 일치하는 인덱스 찾기
  private static int findIndexOfAccount(String accountNumber) {
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] == null) { // null 요소는 패스
        continue;
      }
      if (accounts[i].getAccountNum().equals(accountNumber)) {
        return i;
      }
    }
    return NOT_FOUND;
  }

  //동명이인 체크
  private static boolean dupChkAccountName(String accountName) {
    boolean dup = false;
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] == null) { // null 요소는 패스
        continue;
      }
      if (accounts[i].getAccountName().equals(accountName)) {
        dup = true;
      }
    }
    return dup;
  }

  // 배열에서 최초로 null인 인덱스 찾기, 없으면 -1 반환
  public static int findNullIndex() {
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] == null) {
        return i;
      }
    }
      return NOT_FOUND;
  }
}