package com.kh.day11.g;

public class A {
  void averageScore(int... values) {
    double result = 0.0;
    int sum = 0;
    for (int value : values) {
      sum += value;
    }
    result = (double) sum / values.length;
    System.out.println(result);
  }
}
