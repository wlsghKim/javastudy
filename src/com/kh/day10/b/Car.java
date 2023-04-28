package com.kh.day10.b;

public class Car {
  //속성정의
  private String color;
  private int speed;
  private int number;

  //객체생성방법
  public Car(String color,int speed, int number) {
    this.color = color;
    this.number = number;
    this.speed = speed;
  }

  //행위정의
  public void speedUp(int speed) {
    System.out.println("속도를 올리다");
    this.speed = speed;
  }

  public void speedDown(int speed) {
    System.out.println("속도를 내리다");
    this.speed = speed;
  }

  //속성의 접근(getter, setter)

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  //객체의 상태

  @Override
  public String toString() {
    return "Car{" +
        "color='" + color + '\'' +
        ", speed=" + speed +
        ", carnumber=" + number +
        '}';
  }
}

