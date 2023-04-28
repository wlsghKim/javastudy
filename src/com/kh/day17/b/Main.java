package com.kh.day17.b;

import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Dish dish1 = new Dish("노랑");
    Dish dish2 = new Dish("파랑");
    Dish dish3 = new Dish("빨강");

    Stack<Dish> dishes = new Stack<>();

    //저장
    dishes.push(dish1);
    dishes.push(dish2);
    dishes.push(dish3);

    System.out.println(dishes);

    // 추출(peek) without removing
    Dish first = dishes.peek();
    System.out.println(dishes);
    System.out.println(first);

    //검색
    int position = dishes.search(dish1);
    System.out.println(position);

    // 추출(pop)
    Dish first2 = dishes.pop();
    System.out.println(dishes);
    System.out.println(first2);

    //전체 삭제
    dishes.clear();
    System.out.println(dishes.size());

  }
}
