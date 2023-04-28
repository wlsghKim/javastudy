package com.kh.day16.c;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new LinkedList<>();

    System.out.println("추가");
    add(list1); //ArrayList
    add(list2); //LinkedList

    System.out.println("삽입");
    insert(list1);
    insert(list2);

    System.out.println("삭제");
    delete(list1);
    delete(list2);
  }

  //추가
  static void add(List<Integer> list) {
    long start = System.nanoTime();
//    System.out.println(System.nanoTime()); //1970.1.1 자정 ~ 현재시간을 초로 환산

    for (int i = 0; i < 1_000_00; i++) {
      list.add(i);

    }
    long end = System.nanoTime();
    System.out.println("처리시간=" + (end - start));

  }


  //삽입
  static void insert(List<Integer> list) {
    long start = System.nanoTime();
    //   System.out.println(System.nanoTime()); //1970.1.1 자정 ~ 현재시간을 초로 환산

    for (int i = 0; i < 1_000_00; i++) {
      list.add(0, i);

    }
    long end = System.nanoTime();
    System.out.println("처리시간=" + (end - start));

  }

  //삭제
  static void delete(List<Integer> list) {
    long start = System.nanoTime();
    //   System.out.println(System.nanoTime()); //1970.1.1 자정 ~ 현재시간을 초로 환산

    for (int i = 0; i < 1_000_00; i++) {
      list.remove(0);

    }
    long end = System.nanoTime();
    System.out.println("처리시간=" + (end - start));
  }
}
