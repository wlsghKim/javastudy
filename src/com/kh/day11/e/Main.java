package com.kh.day11.e;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    A a = new A();

    int m = 5;
    int[] n = {1, 2, 3,};

    a.abc(m);
    a.bcd(n);

    System.out.println(m);
    System.out.println(Arrays.toString(n));
  }
}
