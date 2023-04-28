package com.kh.day17.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Main {
  public static void main(String[] args) {
    List<Boolean> list = new Vector<>();
    list.add(true);
    list.add(false);
    list.add(true);

    Boolean[] booleans = list.toArray(new Boolean[5]);
    System.out.println(Arrays.toString(booleans));

    Object[] objects = list.toArray();
    System.out.println(Arrays.toString(objects));

  }
}
