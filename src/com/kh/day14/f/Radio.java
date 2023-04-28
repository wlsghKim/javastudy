package com.kh.day14.f;

public class Radio implements Soundable, SmartPower{
  @Override
  public void sound() {
    System.out.println("음악이 흘러나오다.");
  }

  public Radio() {
    super();
  }

  @Override
  public void on() {

  }

  @Override
  public void off() {

  }
}
