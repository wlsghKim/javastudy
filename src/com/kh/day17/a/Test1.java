package com.kh.day17.a;

import java.util.*;


public class Test1 {
  public static void main(String[] args) {
    Map<String, Integer> scores = new HashMap<>();//key :이름 , value: 점수

    //추가
    scores.put("홍길동", 90);
    scores.put("홍길서", 80);
    scores.put("홍길남", 70);
    // 중복 키는 entry대체
    System.out.println(scores.put("홍길남", 80));


    System.out.println(scores);
    // 수정
    scores.replace("홍길남", 100);
    System.out.println(scores);

    // 검색
    Integer val = scores.get("홍길남");
    System.out.println("홍길남의 정수: " + val);

    //key값 존재 유무
    if (scores.containsKey("홍길남")) {
      System.out.println("찾고자하는 키값이 존재함");
    } else {
      System.out.println("찾고자 하는 키값이 없음");
    }

    //value값 존재 유무
    if (scores.containsValue(100)) {
      System.out.println("찾고자 하는 value값이 존재함");
    } else {
      System.out.println("찾고자 하는 value값이 없음");
    }

    //모든 key값 추출
    Set<String> names = scores.keySet();
    System.out.println("학생 이름 나열: " + names);

    // 모든 value값 추출
    Collection<Integer> values = scores.values();
    System.out.println("점수 나열 : " + values);

    // entry추출(key, value를 쌍으로)
    Set<Map.Entry<String, Integer>> entries = scores.entrySet();

    for (Map.Entry<String, Integer> ele : entries) {
      String key = ele.getKey();
      Integer value = ele.getValue();
      System.out.printf("%s %d\t", key, value);
    }
    System.out.println();

    Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
    while (iterator.hasNext()) {
      Map.Entry<String, Integer> next = iterator.next();
      String key  = next.getKey();
      Integer value = next.getValue();
      System.out.printf("%s %d\t", key,value);
    }
    System.out.println();

    //삭제
    scores.remove("홍길남");
    System.out.println(scores);

    //전체 삭제
    scores.clear();
    System.out.println("요소 갯수 : " + scores.size());
  }
}