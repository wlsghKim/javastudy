package com.kh.day15.a;

public class Main2 {
  public static void main(String[] args) {
    Cat cat = new Cat();
    Radio radio = new Radio();
    Speaker speaker = new Speaker();

    cat.sound();
    radio.sound();
    speaker.sound();

    Soundable s1 = new Cat();
    Soundable s2 = new Radio();
    Soundable s3 = new Speaker();

    s1.sound();
    s2.sound();
    s3.sound();

    Radio radio2 = (Radio)s2;
    radio2.tuneChannel();
  }
}
