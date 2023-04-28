package com.kh.day17.b;
//Stack <E> 접시쌓기 [Lifo구조]
public class Dish {
  private String color;

  public Dish(String color){
    this.color = color;
  }

  @Override
  public String toString() {
    return "Dish{" +
        "color='" + color + '\'' +
        '}';
  }

  public String getColor() {
    return color;
  }
}

