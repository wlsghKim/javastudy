package com.kh.day14.f;

public class Mp3player extends Radio implements Chargable{
  public void playMp3() {
    System.out.println("mp3를 플레이하다;");
  }
  @Override
  public void chargee() {
    System.out.println("충전하다");
  }
}
