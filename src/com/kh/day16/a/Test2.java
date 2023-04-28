package com.kh.day16.a;

public class Test2 extends Thread {
  @Override
  public void run() {
    try {
      for (int k = 20; k < 30; k++) {
        Thread.sleep(300);
        System.out.println("k=" + k);
      }
    } catch (InterruptedException e) {

    }
  }
}