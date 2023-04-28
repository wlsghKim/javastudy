package com.kh.day13.d;

public class Person {
  private String name;
  private int age;
  private Phone phone; //null

  public void setPhone(Phone phone) {
    this.phone = phone;
  }

  public Phone getPhone() {
    return phone;
  }

  public void call(Phone[] phones) {
    for (int i = 0; i < phones.length; i++) {
      phones[i].speak();
      //이 구간에서만 폰을 가지고 있는 상태.
    }
  }
}
