package com.kh.dic;

import java.util.Scanner;

public class DictionaryMain {

  public static void main(String[] args) {
    Dictionary dictionary = new Dictionary();


    while (true) {

      // 메인화면(메뉴)
      dictionary.Menu();

      //메뉴
      Scanner scan = new Scanner(System.in);
      String select = scan.nextLine();


      if (select.equals("1")) {
        dictionary.wordSave();

      } else if (select.equals("2")) {
        dictionary.wordSearch();

      } else if (select.equals("3")) {
        dictionary.modification();

      } else if (select.equals("4")) {
        dictionary.wordDelete();

      } else if (select.equals("5")) {
        dictionary.wordlist();

      } else if (select.equals("6")) {
        dictionary.lookup();

      } else if (select.equals("7")) {
        dictionary.statistics();

      } else if (select.equals("8")) {
        dictionary.exit();
        break;

      } else {
        System.out.println("1~8까지의 숫자만 입력하세요.");
      }
    }
    System.out.println("프로그램 종료!");
  }

}

