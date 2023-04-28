package com.kh.day16.g;

import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    TreeSet<Integer> treeSet = new TreeSet<>();

    // 6, 3, 9, 2, 5
    treeSet.add(6);
    treeSet.add(3);
    treeSet.add(9);
    treeSet.add(2);
    treeSet.add(5);

    System.out.println("최소값= " + treeSet.first());
    System.out.println("최대값= " + treeSet.last());

  }
}
