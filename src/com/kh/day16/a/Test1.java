package com.kh.day16.a;

public class Test1 extends Thread{
  @Override
  public void run() {
    try {
      for (int j = 10; j < 20;  j++) {
        Thread.sleep(300);
        System.out.println("j=" + j);
      }
    } catch (InterruptedException e) {

    }
  }
}
