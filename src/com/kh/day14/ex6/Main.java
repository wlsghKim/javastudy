package com.kh.day14.ex6;

public class Main {
  public static void main(String[] args) {
    A aa = new A();
    aa.hello();

    B bb = new B();
    bb.hello();

    A ab = new B();
    ab.hello();
    System.out.println(ab.name);
  }
}
