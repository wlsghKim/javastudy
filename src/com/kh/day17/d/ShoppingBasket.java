package com.kh.day17.d;
//제네릭
public class ShoppingBasket {
  private Fruit fruit;

  public void put(Fruit fruit) {
    this.fruit = fruit;
  }

  public void remove() {
    this.fruit = null;
  }
  public Fruit get(){
    return this.fruit;
  }

}
