package com.kh.day10.c;

public class CarMain2 {
  public static void main(String[] args) {
    Car car1 = new Car(1,"검정");
    Car car2 = new Car(2,"빨강");
    Car car3 = new Car(3,"파랑");
    car1.speedUp();
    car2.speedUp();
    car3.speedUp();

    System.out.println(car1);
    System.out.println(car2);
    System.out.println(car3);
    System.out.println("------------------------------------");

    Car[] cars = new Car[3];
    cars[0] = new Car(1,"검정");
    cars[1] = new Car (2,"빨강");
    cars[2] = new Car(3,"파랑");

    for (int i = 0; i < cars.length; i++) {
      cars[i].speedUp();
      System.out.println(cars[i]);
    }
  }
}
