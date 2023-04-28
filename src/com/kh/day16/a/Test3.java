package com.kh.day16.a;

public class Test3 implements Runnable {
  @Override
  public void run() {
    try {
      for (int l = 30; l < 40; l++) {
        Thread.sleep(300);
        System.out.println("l=" + l);
      }
    } catch (InterruptedException e) {
    }
  }
}