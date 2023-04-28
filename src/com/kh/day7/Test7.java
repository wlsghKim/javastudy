package com.kh.day7;

public class Test7 {
  public static void main(String[] args) {

    int x = 10;
    int y = 10;

    //기본형의 등치비교
    if (x == y) {
      System.out.println("같다");
    }else{
      System.out.println("다르다");
    }

    //참조형의 등치비교는 주소값 비교
    String name = "홍길동";
    String name2 = "홍길동";
    if (name == name2) {
      System.out.println("같다");
    }else {
      System.out.println("다르다");
    }

    String name3 = new String("홍길동");
    String name4 = new String("홍길동");
    if (name3 == name4) {
      System.out.println("같다");
    }else {
      System.out.println("다르다");
    }

    //문자열의 내용 비교
    if(name.equals(name2)){
        System.out.println("같다");
      }else {
        System.out.println("다르다");
      }
    }
  }