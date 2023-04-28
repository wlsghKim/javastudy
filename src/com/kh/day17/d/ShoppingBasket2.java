package com.kh.day17.d;
/*
* T 부분에 타입을 넣으면 컴파일이 변경시켜
* 비슷한 코드를 유연하게 사용가능
* */
public class ShoppingBasket2<T> {
  private T vegetable;

  public void put(T vegetable) {
    this.vegetable = vegetable;
  }

  public void remove() {
    this.vegetable = null;
  }
  public T get(){
    return this.vegetable;
  }
}
