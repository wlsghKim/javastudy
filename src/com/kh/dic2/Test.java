package com.kh.dic2;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test {
  //String method  - substring(int beginIndex)
  public static void main(String[] args) {
    TreeSet treeSet = new TreeSet();
    treeSet.add("student");
    treeSet.add("teacher");
    treeSet.add("classroom");
    treeSet.add("smart");
    treeSet.add("lunch");
    treeSet.add("start");
    treeSet.add("subject");

    System.out.println(treeSet);

    String inputWord = "st";  //classroom

    System.out.println(inputWord.charAt(0));
    System.out.println(inputWord.charAt(1));
    System.out.println(inputWord.charAt(inputWord.length()-1));
//    마지막 문자
//    charAt  특정 문자 추출
//    inputWord.charAt()
    char lastChar = inputWord.charAt(inputWord.length()-1);
    char nextCharOflastChar = (char)(lastChar + 1);
    System.out.printf("%c %c\n", lastChar, nextCharOflastChar);

    //마지막 글자 제외 검색
    String preWord = inputWord.substring(0,inputWord.length()-1);
    System.out.println(preWord);

    String fromWord = preWord + lastChar;
    String endWord = preWord + nextCharOflastChar;
    System.out.printf("%s %s\n", fromWord, endWord);

    NavigableSet subset = treeSet.subSet(fromWord, false, endWord, false);
    System.out.println(subset);

  }
}
