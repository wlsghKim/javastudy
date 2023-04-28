package com.kh.day13.d;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();

    Phone samsungPhone = new SamsungPhone();
    Phone lgPhone = new LgPhone();
    Phone applePhone = new ApplePhone();


    person.setPhone(samsungPhone);
    person.getPhone().speak();
//   person.phone = samsungPhone;
//   person.phone.speak();
    person.setPhone(lgPhone);
    person.getPhone().speak();
//    person.phone = lgPhone;
//    person.phone.speak();
    person.setPhone(applePhone);
    person.getPhone().speak();
  }
}
