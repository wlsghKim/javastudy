package com.kh.dic2;

import java.util.*;

/**
 * 영한사전 구현
 *  @author 작성자명
 *  @version 버전정보
 */
public class Dictionary implements DictionaryI {

  //dictionary 인스턴스가 만들어질때 초기화됨
  private TreeMap data = new TreeMap<>();
  public static final int MAX_SIZE = 5; // 저장할 수 있는 단어 최대 갯수

  /**
   *기본 생성자
   */

  public Dictionary() {
   // init();  //데이터 초기화
  }

  private void init() {
    data.put("student", "학생");
    data.put("teacher", "교사");
    data.put("classroom", "교실");
    data.put("smart", "현명한");
    data.put("lunch", "점심");
  }

  /**
   * api문서 작성법
   * 신규 단어 추가
   * @param word    단어 //@param 매개변수
   * @param meaning 뜻
   */
  @Override
  public void put(String word, String meaning) {
    // 1) 단어수 초과 체크
    if (data.size() == MAX_SIZE) {
//      System.out.println("최대 5개 단어만 저장할 수 있습니다.");
//      return;
      throw new DictionaryException("최대 5개 단어만 저장할 수 있습니다.");
    }
    // 2)단어 중복 체크
    if (data.containsKey(word)) {
//      System.out.println(word + "단어는 이미 등록되었습니다.");
//      return;
      throw new DictionaryException(word + "단어는 이미 등록되었습니다.");
    }
    this.data.put(word.toLowerCase(), meaning);
  }

  /**
   * 단어 검색
   *
   * @param word 단어
   * @return
   */
  @Override
  public Map<String, String> findByWord(String word) {
    word = word.toLowerCase();

    Map<String, String> map = new HashMap<>();
    String meaning = (String) (data.get(word));
    // 1) 일치하는 단어를 찾은 경우
    if (meaning != null) {
      map.put(word, meaning);
      // 2) 일치하는 단어를 찾지 못한 경우
    } else {
      String fromWord = null; //시작 문자열
      String toWord = null; //마지막 문자열

      //1개의 문자가 입력된 경우
      if (word.length() == 1) {
        //단어의 마지막 문자 추출
        char lastChar = word.charAt(0);
        //단어의 마지막 문자의 다음 문자 추출
        char nextCharOflastChar = (char) (lastChar + 1);

        //문자열 검색 시작 문자열
        fromWord = word;
        //문자 -> 문자열 반환
        toWord = String.valueOf(nextCharOflastChar);

        // 2개 이상의 문자가 입력된 경우
      } else {
        //단어의 마지막 문자 추출
        char lastChar = word.charAt(word.length() - 1);
        //단어의 마지막 문자다음 문자 추출
        char nextCharOflastChar = (char) (lastChar + 1);
        //단어의 마지막문자를 제외한 문자열 추출
        String preWord = word.substring(0, word.length() - 1);

        //문자열 검색 시작 문자열
        fromWord = preWord + lastChar;
        //문자열 검색 마지막 문자열
        toWord = preWord + nextCharOflastChar;
      }

      NavigableMap findedWords = data.subMap(fromWord, false, toWord, false);
      map = findedWords;
//      data.subMap(word, false, )

      if (map.size() == 0) {
        throw new DictionaryException("검색하고자 하는 단어가 없습니다.");
      }
    }
    return map;
  }


  // 배열 방식
//  public String[] findByWord2(String word) {
//    String[] words = new String[2];
//    String meaning = (String) (data.get(word));
//    words[0] = word;
//    words[1] = meaning;
//    return words;
//  }
//  public String[] findByWord3(String word) {
//    String meaning = (String) (data.get(word));
//    String[] words = {word, meaning}; // new String[]{word, meaning}
//    return words;
//  }

  /**
   * 수정
   *
   * @param word    단어
   * @param meaning 뜻
   */
  @Override
  public void update(String word, String meaning) {
    word = word.toLowerCase();
    if (data.replace(word, meaning) == null) {
      throw new DictionaryException("검색하고자 하는 단어가 없습니다.");
    }
  }

  /**
   * 삭제
   *
   * @param word 단어
   */
  @Override
  public void delete(String word) {
    word = word.toLowerCase();
    if (data.remove(word) == null) {
      throw new DictionaryException("검색하고자 하는 단어가 없습니다.");
    }
  }

  /**
   * 목록
   * @param howToSort 소트방법 : 1.오름차순 2.내림차순
   * @return 단어장
   */
  @Override
  public Map<String,String> list(int howToSort) {
    Map<String,String> map = null;

    switch (howToSort) {
      case 1: // 오름차순
        map = data;
        break;
      case 2: // 내림차순
        map = data.descendingMap();
        break;
      default:
    }

    return map;
  }

  /**
   * 색인
   *
   * @param ch 문자
   * @return 단어들
   */

  @Override
  public List<String> index(char ch) {

   ch = Character.toLowerCase(ch);

    List<String> list = new ArrayList<>();
    //단어만 추출
    Set set = data.keySet();
    TreeSet treeSet = new TreeSet<>(set);

    //범위 추출
    String from = String.valueOf(ch);
    String to = String.valueOf((char) (ch + 1));
    NavigableSet subSet = treeSet.subSet(from, false, to, false);

    for (Object obj : subSet) {
      String word = (String) obj;
      list.add(word);
    }
    if(list.size() == 0){
      throw new DictionaryException("색인 정보가 없습니다.");
  }
    return list;
  }

  /**
   * 통계
   * @return 단어갯수, 문자열길이가 가장긴 단어, 문자열길이 내림차순
   */
  @Override
  public List<Object> statistics() {

    List<Object> result = new ArrayList<>();

    // 1) 저장된 단어 갯수
    int cntOfWords = data.size();
    result.add(cntOfWords);

    // 2) 단어의 문자수가 가장 많은 단어
    // 2-1) 단어,단어의길이를 요소로 같는 map객체 생성
    Map<String, Integer> mapWithWordAndLength = getStringIntegerMap();

    // 2-2) 단어의 길이가 가장 큰값 찾기
    int max = getMax(mapWithWordAndLength);

    // 2-3) 단어의 길이가 가장 큰값과 일치하는 단어 추출
    List<String> words = getStrings(mapWithWordAndLength, max);
    result.add(words);

    // 3) 단어 글자수 내림차순 출력(단어만)
    WordLength wl = new WordLength(mapWithWordAndLength);
    // 문자열 길이로 내림차순 정렬
    TreeMap<String,Integer> treeMap = new TreeMap<>(wl);
    treeMap.putAll(mapWithWordAndLength);

    // 단어 내림차순된 문자열을 list에 담기
    List<String> list = new ArrayList<String>(treeMap.keySet());
    result.add(list);

    return result;
  }

  private List<String> getStrings(Map<String, Integer> mapWithWordAndLength, int max) {
    List<String> words = new ArrayList<>();
    Set<Map.Entry<String, Integer>> entries = mapWithWordAndLength.entrySet();
    for( Map.Entry<String, Integer> entry : entries){
      if(entry.getValue() == max){
        words.add(entry.getKey());
      }
    }
    return words;
  }

  private int getMax(Map<String, Integer> mapWithWordAndLength) {
    int max = 0;
    for( Integer length : mapWithWordAndLength.values()){
      if(length > max) max = length;
    }
    return max;
  }

  private Map<String, Integer> getStringIntegerMap() {
    Map<String,Integer> mapWithWordAndLength = new HashMap<>(); // key:단어, value:문자수
    for (String word : (Set<String>) data.keySet()) {
      mapWithWordAndLength.put(word, word.length());
    }
    return mapWithWordAndLength;
  }

  @Override
  public String toString() {
    return "Dictionary{" +
        "data=" + data +
        '}';
  }

  public TreeMap getData() {
    return data;
  }

  class WordLength implements Comparator<String>{
    Map<String,Integer> word;

    public WordLength(Map<String, Integer> word) {
      this.word = word;
    }

    @Override
    public int compare(String o1, String o2) {
      int result = 0;
      if(word.get(o1) >= word.get(o2)){
        result = -1;
      }else{
        result = 1;
      }
      return result;
    }
  }
}