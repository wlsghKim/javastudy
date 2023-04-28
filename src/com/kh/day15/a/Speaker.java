package com.kh.day15.a;

public class Speaker implements Soundable, SmartPower {
  @Override
  public void sound() {
    System.out.println("스피커 소리");
  }

  public Speaker() {
    super();
  }

  @Override
  public void on() {

  }

  @Override
  public void off() {

  }
}


