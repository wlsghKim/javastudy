package com.kh.day10.c;

public class Car3 {
  //속성 :차량번호, 운행속도, 색상
  private static int currentnumber;
  private  int number;
  private  int speed;
  private String color;
  private final int SPEED_STEP = 10;

  //생성자  객체간 공유가 가능한 필드
  public Car3(String color) {
    //this.number = number; //차량번호를 개별적으로 주면 중복이 나올수있다.
    this.color = color;
    this.currentnumber += 1;
    number =currentnumber;
  }

  // 행위 :가속하다, 감속하다
  public void speedUp() {
    if (this.speed + SPEED_STEP > 240) {
      return;
    }
    speed += SPEED_STEP; //speed = speed + 10;
  }

  public void speedDown() {
    if (this.speed - SPEED_STEP < 0) {
      return;
    }
    speed -= SPEED_STEP;
  }


  public int getNumber() {
    return number;
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

  @Override
  public String toString() {
    return
        "Car{"
          + "number=" + number
          + ", speed=" + speed
          + ", color=" + color + '\'' +
        '}';
  }

//  public static int number() {
//    return number;
  }

