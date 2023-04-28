package Exam.Bank;

import java.util.Scanner;

public class AccountMain {
  private static Account[] accountArray = new Account[100];
  private static Scanner scanner = new Scanner(System.in);
  private static int balance;
  private static String ano;

  public static void main(String[] args) {

    while (true) {

      System.out.println("-----------------------------------------------------------------------------");
      System.out.println("1.신규 | 2.폐지 | 3.입금 | 4.출금 | 5.계좌조회(개별) | 6.계좌조회(전체) | 7.종료(x) ");
      System.out.println("-----------------------------------------------------------------------------");
      System.out.print("선택>");

      //사용자로부터 1~5까지를 입력받고 선택
      int selectNo = scanner.nextInt();

      if (selectNo == 1) {
        createAccount();
      } else if (selectNo == 2) {
        DeleteAccount();
      } else if (selectNo == 3) {
        deposit();
      } else if (selectNo == 4) {
        withdraw();
      } else if (selectNo == 5) {
        System.out.println("계좌조회(개별)");
        individualAccount();
      } else if (selectNo == 6) {
        accountListWhole();
      } else if (selectNo == 7) {
        System.out.println("프로그램 종료");
        break;
      } else {
        System.out.println("잘못입력하셨습니다.");
      }
    }
  }

  //1.신규 계좌개설
  private static void createAccount() {
    System.out.println("---------");
    System.out.println("계좌개설");
    System.out.println("---------");
    System.out.print("예금주: ");
    String owner = scanner.next();
    System.out.print("계좌번호: ");
    String ano = String.valueOf(Math.floor(Math.random() * 999) + 1);
    System.out.println(String.valueOf(ano));

    Account newAccount = new Account(ano, owner, balance);
    for (
        int i = 0;
        i < accountArray.length; i++) {
      if (accountArray[i] == null) {
        accountArray[i] = newAccount;
        System.out.println(" ");
        break;
      }
    }
  }


  //2. 폐지
  private static void DeleteAccount() {
    System.out.println("---------");
    System.out.println("계좌 폐지");
    System.out.println("---------");

    System.out.print("계좌번호: ");
    String ano = scanner.next();


    for (int i = 0; i < accountArray.length; i++) {
      Account account = accountArray[i];
      if (account != null) {

        if (accountArray[i].getBalance() != 0) {
          System.out.println("잔액이 남았습니다");
          return;
        }
        accountArray[i] = null;
        System.out.println("계좌를 삭제하였습니다.");
      }
    }
  }


  // 3.입금하기
  private static void deposit() {
    System.out.println("---------");
    System.out.println("입금");
    System.out.println("---------");
    System.out.print("계좌번호: ");
    String ano = scanner.next();
    System.out.print("입금액: ");
    int money = scanner.nextInt();

    Account account = findAccount(ano);
    // 계좌가 없다면 종료
    if (account == null) {
      System.out.println("결과 : 계좌가 없습니다.");
      return;
    }
    if (money > 40000) {
      System.out.println("1회 입금 한도를 초과했습니다.");
      return;
    }

    account.setBalance(account.getBalance() + money);
    System.out.println("결과 : 입금 되었습니다.");
  }

  private static Account findAccount(String ano) {
    Account account = null;
    for (int i = 0; i < accountArray.length; i++) {
      if (accountArray[i] != null) {
        String dbAno = accountArray[i].getAno();
        if (dbAno.equals(ano)) {
          account = accountArray[i];
          break;
        }
      }
    }
    return account;
  }

  // 4.출금하기
  private static void withdraw() {
    System.out.println("---------");
    System.out.println("출금");
    System.out.println("---------");
    System.out.print("계좌번호: ");
    String ano = scanner.next();
    System.out.print("출금액: ");
    int money = scanner.nextInt();
    Account account = findAccount(ano);
    if (account == null) {
      System.out.println("결과 : 계좌가 없습니다.");
      return;
    }
    if (money > 40000) {
      System.out.println("1회 출금 한도를 초과했습니다.");
      return;
    }
    account.setBalance(account.getBalance() - money);
    System.out.println("결과: 출금 되었습니다.");
    System.out.println("현재잔액: " + account.getBalance());
    {

    }
  }

  //5.계좌조회하기(개별)
  private static void individualAccount() {
    System.out.println("---------");
    System.out.println("계좌조회(개별)");
    System.out.println("---------");

    System.out.println("계좌번호를 입력해주십시오");
    System.out.print("입력 >>");
    String ano = scanner.next();
    {
      for (int i = 0; i < accountArray.length; i++) {
        Account account = accountArray[i];
        if (account != null) {
          System.out.print("계좌번호: " + accountArray[i].getAno() + "\t");
          System.out.print("계좌주명: " + accountArray[i].getOwner() + "\t");
          System.out.println("잔액: " + accountArray[i].getBalance());
        }
      }
    }
  }

  //6. 계좌조회하기(전체)
  private static void accountListWhole() {
    System.out.println("---------");
    System.out.println("계좌조회(전체)");
    System.out.println("---------");

    for (int i = 0; i < accountArray.length; i++) {
      Account account = accountArray[i];
      if (account != null) {
        System.out.print("계좌번호: " + accountArray[i].getAno() + "\t");
        System.out.print("계좌주명: " + accountArray[i].getOwner() + "\t");
        System.out.println("잔액: " + accountArray[i].getBalance());
      }
    }
  }
}