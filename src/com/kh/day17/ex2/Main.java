package com.kh.day17.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(3);
    list.add(4);
    System.out.println(list);
    Integer ele = list.remove(2);
    System.out.println(list);
  }
}
