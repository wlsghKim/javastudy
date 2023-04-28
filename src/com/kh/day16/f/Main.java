package com.kh.day16.f;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Set<Integer> setA = new HashSet<>();
    Set<Integer> setB = new HashSet<>();

    setA.add(1);setA.add(2);setA.add(3);
    setB.add(3);setB.add(4);setB.add(5);

//    //합집합
//    setA.addAll(setB);
//    for (Integer i:setA) {
//      System.out.printf("%d " ,i);
//    }
//    System.out.println();
//
//    //차집합
//    setA.removeAll(setB);
//    for (Integer i:setA) {
//      System.out.printf("%d " ,i);
//    }
//    System.out.println();

    //교집합
    setA.retainAll(setB);
    for (Integer i:setA) {
      System.out.printf("%d " ,i);
    }
    System.out.println();

    //setB는 setA의 부분집합인지 확인
//    if(setA.containsAll(setB)){
//      System.out.println("부분집합이다.");
//    }else {
//      System.out.println("부분집합이 아니다");
//    }

  }
}
