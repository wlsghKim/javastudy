package com.kh.day17.d;

public class Main {

  public static void main(String[] args) {
    ShoppingBasket shoppingBasket = new ShoppingBasket();
    Apple apple = new Apple();
    Orange orange = new Orange();
    Banana banana = new Banana();

    shoppingBasket.put(apple);
    shoppingBasket.remove();

    shoppingBasket.put(orange);
    shoppingBasket.put(banana);

    Fruit fruit = shoppingBasket.get();

    System.out.println("====================");
    ShoppingBasket2<Fruit> shoppingBasket2 = new ShoppingBasket2<>();
    shoppingBasket2.put(new Apple());
    Fruit fruit1 = shoppingBasket2.get();

    ShoppingBasket2<Vegetable> shoppingBasket3 = new ShoppingBasket2<>();
    shoppingBasket3.put(new Tomato());
    Vegetable vegetable = shoppingBasket3.get();
  }
}
