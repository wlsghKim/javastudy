package com.kh.day16.h;

import java.util.Comparator;
/*
* Person 객체의 나이 오름차순
* */

public class MyComparator1 implements Comparator {
  @Override
  public int compare(Object o1, Object o2) {
    int result = 0;
    Person p1 = (Person)o1;
    Person p2 = (Person)o2;

//    Integer value1 = (Integer) (p1.getAge());

//    if(p1.getAge() > p2.getAge()) {
//      result = 1;
//    }else if(p1.getAge() < p2.getAge()) {
//      result = -1;
//    }
    return ((Integer) (p1.getAge())).compareTo(p2.getAge());
  }
}


// 로직을 만든다