package com.kh.day9.g;

public class Main {
  public static void main(String[] args) {
    //객체의 인스턴스화(실체화)
    Car car = new Car( "검정");
    //객체에 속성 주기
    car.setColor("빨강");
    //객체에 행위 요청하기
    car.speedUp((80));

    //객체 상태 확인하기
    System.out.println(car.toString());
  }
}
