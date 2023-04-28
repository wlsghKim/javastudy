package com.kh.day17.a;

import java.util.*;

public class Test2 {
  public static void main(String[] args) {
    TreeMap<String, Integer> scores = new TreeMap<>();

    scores.put("홍길동60", 60);
    scores.put("홍길동30", 30);
    scores.put("홍길동90", 90);
    scores.put("홍길동20", 20);
    scores.put("홍길동50", 50);

    System.out.println(scores);

    System.out.println(scores.firstKey());
    System.out.println(scores.firstEntry());

    Map.Entry<String, Integer> ele = scores.firstEntry();
    Integer value = ele.getValue();
    System.out.println(value);

    System.out.println(scores.firstEntry().getValue());  // scores.firstEntry로 호출후 key나 value값 뽑을수 있음

    System.out.println(scores.lowerKey("홍길동60"));
    System.out.println(scores.lowerEntry("홍길동60"));


    System.out.println(scores.higherKey("홍길동60"));
    System.out.println(scores.higherEntry("홍길동60"));

//    Map.Entry<String, Integer> firstEntry = scores.pollFirstEntry();
//    System.out.println(firstEntry);
//    System.out.println(scores);

    // 매개값 이하, 미만
    SortedMap<String, Integer> headMap = scores.headMap("홍길동60", false);
    System.out.println(headMap);

    // 매개값 이상, 초과
    SortedMap<String, Integer> tailMap = scores.tailMap("홍길동60", false);
    System.out.println(tailMap);

    //30 이상 60 미만
    NavigableMap<String, Integer> subMap =scores.subMap("홍길동30", true, "홍길동60", false);
    System.out.println(subMap);

    // 내림차순 entry
    NavigableMap<String, Integer> descendingMap = scores.descendingMap();
    System.out.println(descendingMap);

    NavigableMap<String, Integer> descendingMap2 = descendingMap.descendingMap();
    System.out.println(descendingMap2);

    //내림차순 key
    NavigableSet<String> names = scores.descendingKeySet();
    System.out.println(names);
  }
}