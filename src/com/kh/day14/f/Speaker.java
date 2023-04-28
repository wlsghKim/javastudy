package com.kh.day14.f;

public class Speaker implements Soundable, SmartPower{
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


