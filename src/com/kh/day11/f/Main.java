package com.kh.day11.f;

public class Main {
  public static void main(String[] args) {

    int x = 10;
    int y = 20;
    // x,y의 합을 구하는 메소드를 추가 정의하여 구현하시오. (기본타입, 참조타입)

    //case1)
    int sum = sum(x, y);
    System.out.println("sum= " + sum);

    //case2)
    int sum2 = sum(new int[]{x, y});
    System.out.println("sum2= " + sum2);

    //case3)
    int[] values = new int[2];
    values[0] = x;
    values[1] = y;
    int sum3 = sum(values);
    System.out.println("sum3= " + sum3);

    //case3)
    int[] value2 = new int[]{x, y};
    int sum4 = sum(value2);
    System.out.println("sum4= " + sum4);

    //case4)
    int[] values3 = new int[3];
    values3[0] = x;
    values3[1] = y;
    sum2(values3);
    System.out.println("sum= " + values3[2]);

    //case5)
    A a = new A(x, y);
    int sum5 = sum(a);
    System.out.println("sum5= " + sum5);

  }
  static int sum(int x, int y) {
    int sum = 0;
    sum = x + y;
    return sum;
  }
  static int sum(int[] values) {
    int sum = 0;

    for (int value : values) {
      sum += value;
    }
    return sum;
  }

  static void sum2(int[] values) {
    values[2] = values[0] + values[1];
  }

  static int sum(A a) {
    return a.getVal1() + a.getVal2();
  }
}