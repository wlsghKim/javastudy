package com.kh.day15.a;

public class Radio implements Soundable, SmartPower {
  @Override
  public void sound() {
    System.out.println("음악이 흘러나오다.");
  }

  public Radio() {
    super();
  }

  @Override
  public void on() {
    System.out.println("전원을 켜다");

  }

  @Override
  public void off() {
    System.out.println("전원을 끄다");
  }

    public void tuneChannel() {
      System.out.println("주파수를 맞추다.");
    }
  }
