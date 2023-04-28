package sec01_createobjectandusageofmembers.EX01_CreateObjectAndUsageOfMembers;


import createobjectandusageofmembers.A;

public class CreateObjectAndUsageOfMembers {
  public static void main(String[] args) {
    //클래스로 객체(붕어빵) 생성
    A a = new A();

    a.m=5;
    System.out.println(a.m);

    a.print();

    System.out.println(a.toString());
  }
}
