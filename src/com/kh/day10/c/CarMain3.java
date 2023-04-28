package com.kh.day10.c;

public class CarMain3 {
  public static void main(String[] args) {
    //객체간 공유가 불가능한 필드
    Car3[] cars =new Car3[3];

    for (int i = 0; i < cars.length; i++) {
      cars[i] = new Car3("검정");
    }
    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i].toString());
    }
  }
}
