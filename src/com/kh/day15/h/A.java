package com.kh.day15.h;

public class A {
  void abc() {
    try {
      bcd();
    } catch (InterruptedException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  void bcd() throws InterruptedException, ClassNotFoundException{
    Thread.sleep(1000);
    Class.forName("java.lang.Object");
  }
}
