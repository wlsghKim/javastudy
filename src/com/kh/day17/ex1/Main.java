package com.kh.day17.ex1;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 2);
  //  list2.add(3);  //요소의 길이 추가 불가
  //  List.remove(1); //요소길이 축소 불가

    //탐색 가능
    Integer integer = list.get(1);
    System.out.println(integer);
    // 요소 수정 가능
    list.set(1, 3);
    System.out.println(list);

//    List<Integer> list1 = new ArrayList<>();
//    list1.add(1);
//    list1.add(2);
//    list1.add(3);
//    System.out.println(list1);
//    List<Integer> list2 = Arrays.asList(1, 2);
//    list2.add(3);
//    System.out.println(list2);

  }
}
