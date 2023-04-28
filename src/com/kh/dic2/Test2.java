package com.kh.dic2;
//색인 대소문자 구분 X
public class Test2 {
  public static void main(String[] args) {

    char ch = 'a';

    char ch2 = Character.toLowerCase(ch);

    System.out.println(ch2);
    System.out.println((int)(ch));
    System.out.println((char) (ch + 1));
    System.out.println((int) 'z');
    System.out.println((int) 'A');
    System.out.println((int) 'Z');

    System.out.println((char) ('a'-32));


  }
}
