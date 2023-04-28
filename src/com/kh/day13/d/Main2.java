package com.kh.day13.d;

public class Main2 {
  public static void main(String[] args) {
    Person person = new Person();

//  Phone phone1 = new SamsungPhone();
//  Phone phone2 = new LgPhone();
//  Phone phone3 = new ApplePhone();

    Phone[] phones = new Phone[3];
    phones[0] = new SamsungPhone();
    phones[1] = new LgPhone();
    phones[2] = new ApplePhone();

    person.call(phones);

  }
}
