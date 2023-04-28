package com.kh.day16.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
  public static void main(String[] args) {
    int x = 10;
    Integer x2 = Integer.valueOf(x);

    Integer x3 = x; //auto boxing (기본타입 -> 참조타입)
    int y = x3;  //unboxing (참조타입 -> 기본타입)

    //List 계열의 ArrayList객체 생성
    ArrayList<Integer> list1 = new ArrayList<>(); //<> 다이아몬드 연산자 <>컬렉션에 저장할 요소(참조타입O, 기본타입X)
    //추가
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(3);
    System.out.println(list1.toString());

    //삭제: value of Element : 3
    list1.removeAll(List.of(3));
    list1.remove(1);
    System.out.println(list1.toString());

    //수정
    list1.set(0, 10);
    System.out.println(list1.toString());

    //추가(컬렉션)
    list1.addAll(List.of(20, 30, 40));
    System.out.println(list1.toString());

    list1.addAll(2, List.of(25, 27));
    System.out.println(list1.toString());

    //조회
    System.out.println(list1.get(3)); //27

    //전체조회
    // 1) 일반for문
    for (int i = 0; i < list1.size(); i++) {
      System.out.printf("%-3d", list1.get(i));
    }
    System.out.println();


  // 2)향상된 for문
    for(Integer ele :list1) {
    System.out.printf("%-3d", ele);
  }
    System.out.println();

    //list -> 배열변환
    Object[] objects = list1.toArray();
    System.out.println(Arrays.toString(objects));
//    for(Object ele: objects){
//      System.out.println((Integer)ele);

    //컬렉션이 비워졌는지 여부
    if (list1.isEmpty()) {
      System.out.println("요소가 없다.");
    }else {
      System.out.println("요소가 있다.");

      //요소 다 비우기
      list1.clear();
      System.out.println(list1.size() == 0);

    }
  }
}