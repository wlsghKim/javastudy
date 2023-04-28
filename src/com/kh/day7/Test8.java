package com.kh.day7;

public class Test8 {
  public static void main(String[] args) {
    String name = "울산KH정보교육원";
    char ch = name.charAt(0);
    System.out.println(ch);
    System.out.println(name.length());

    for (int i = 0; i < name.length(); i++) {
      System.out.print(name.charAt(i));
    }
    System.out.println();

    char ch2 = name.charAt(name.length() - 1);
    System.out.println(ch2);

    String sub = name.substring(2,4);
    System.out.println(sub);
  }
}