package com.kh.day10.c;

public class Car {
  //속성 :차량번호, 운행속도, 색상
  private String color;
  private int speed;
  private int number;
  private final int SPEED_STEP = 10;

  //생성자
  public Car(int number, String color) {
    this.number =number; //차량번호를 개별적으로 주면 중복이 나올수있다.
    this.color  =color;
  }

  // 행위 :가속하다, 감속하다
  public void speedUp() {
    if (this.speed + SPEED_STEP > 240) {
      return;
    }
    speed +=SPEED_STEP; //speed = speed + 10;
  }
    public void speedDown(){
      if (this.speed - SPEED_STEP < 0) {
        return;
      }
      speed -= SPEED_STEP;
    }


  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public int getSpeed() {
    return speed;
  }

  public int getNumber() {
    return number;
  }

  @Override
  public String toString() {
    return "Car{" +
        "color='" + color + '\'' +
        ", speed=" + speed +
        ", number=" + number +
        '}';
  }
}

