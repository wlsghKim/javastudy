package com.kh.day15.a;

public class WareSpeaker extends Speaker implements Chargable {
  @Override
  public void chargee() {
    System.out.println("충전하다");
  }
}
