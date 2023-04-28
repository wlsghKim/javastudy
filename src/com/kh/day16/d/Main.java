package com.kh.day16.d;

import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    // hashset 객체 생성
    HashSet<String> set = new HashSet<>();

    // 요소 추가
    set.add("귤");
    set.add("바나나");
    set.add("수박");
    set.add("바나나");
    System.out.println(set);

    // 검색
    System.out.println(set.contains("수박"));
    System.out.println(set.contains("오렌지"));

    //삭제
    set.remove("바나나");
    System.out.println(set.contains("바나나"));
    System.out.println(set);

    //조회
    for (String ele :set) {
      System.out.printf("%s ", ele);
    }

  }
}
