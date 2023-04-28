package com.kh.day15.a;

public class Main {
  public static void main(String[] args) {
    System.out.println(Soundable.X);

    Cat c1 = new Cat();
    c1.sound();

    Soundable c2 = new Cat();
    c2.sound();

    Soundable c3 = new Radio();
    c3.sound();

    Soundable c4 = new Mp3player();
    c4.sound();
    
    Mp3player c5 = (Mp3player) c4;
    c5.sound();
    c5.playMp3();

  }
}