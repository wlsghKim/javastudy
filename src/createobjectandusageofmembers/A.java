package createobjectandusageofmembers;

import java.lang.*;

public class A extends Object{
  //필드
  public int m = 3;

  //기본생성자 메소드
  public A(){}

  //메소드
  public void print() {
    System.out.println("객체 생성 및 활용");
  }

  //재정의
  @Override //Ctrl+O
  public String toString() {
    return "test";
  }
}