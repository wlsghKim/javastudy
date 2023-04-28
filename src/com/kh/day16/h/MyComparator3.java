package com.kh.day16.h;

import java.util.Comparator;

/*
 * 이름(오름차순), 나이(오름차순) 기준으로 정렬
 */
public class MyComparator3 implements Comparator {

  @Override
  public int compare(Object o1, Object o2) {
    int result = 0;

    Person p1 = (Person) o1;
    Person p2 = (Person) o2;

    int com1 = p1.getName().compareTo(p2.getName());
    if (com1 == 0) { //이름이 같은경우
      Integer ageOfp1 = (Integer) (p1.getAge());
      Integer ageOfp2 = (Integer) (p2.getAge());

      int com2 = ageOfp1.compareTo(ageOfp2);
      result = com2;

  } else{
    result = com1;
  }

    return result;
  }
}
