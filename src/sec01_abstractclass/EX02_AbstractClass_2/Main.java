package sec01_abstractclass.EX02_AbstractClass_2;

public class Main {
  public static void main(String[] args) {

    //객체 생성
    A a1 = new A() {
      void abc() {
        System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
      }
    };
    A a2 = new A() {
      void abc() {
        System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
      }
    };
    //메서드 호출
    a1.abc();
    a2.abc();
  }
}
