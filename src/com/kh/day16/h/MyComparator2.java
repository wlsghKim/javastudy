package com.kh.day16.h;

import java.util.Comparator;

public class MyComparator2 implements Comparator {
  @Override
  public int compare(Object o1, Object o2) {
    int result = 0;

    Person p1 = (Person)o1;
    Person p2 = (Person)o2;

    if(p1.getAge() > p2.getAge()) {
      result = -1;
    }else if(p1.getAge() < p2.getAge()) {
      result = 1;
    }
    return result;
  }
}

