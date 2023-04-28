package com.kh.day17.ex7;

public class MyData implements Comparable<MyData> {
  String str;

  public MyData(String str){
    this.str = str;
  }

  @Override
  //Comparable<> 안에 아무것도 주지 않으면 Object o가 된다
  public int compareTo(MyData o) {
    return str.compareTo(o.str);

  }

  @Override
  public String toString() {
    return str;
  }
}
