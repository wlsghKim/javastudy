package com.kh.dic;


import java.util.*;

public class Dictionary {

  TreeMap<String, String> dictionary = new TreeMap<String, String>();
  Dictionary[] dictionaries = new Dictionary[5];

  static String key, value;

  public Dictionary() {
    dictionary.put("student", "학생");
    dictionary.put("teacher", "교사");
    dictionary.put("classroom", "교실");
    dictionary.put("smart", "깔끔한");
    dictionary.put("lunch", "점심");

  }

  public void Menu() {
    System.out.println("--------------------------------------------------");
    System.out.println("1.저장 2.검색 3.수정 4.삭제 5.목록 6.색인 7.통계 8.종료");
    System.out.println("--------------------------------------------------");
    System.out.println("입력 >> ");
  }

  //1.저장

  public void wordSave() {
    String eng = null;
    String kor = null;
    boolean stop = false;
    while (!stop) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("저장할 영어단어를 입력하세요(Menu로 가려면 menu입력):");
      eng = scanner.nextLine();
      if (eng.equals("menu") || eng.equals("Menu")) { // String 변수 비교시 .equals사용
        break;
      } else {
        if (dictionary.containsKey(eng) == true) {// key에대한 값이 존재하면
          System.out.println("이미 등록되었습니다.");
        } else { // 등록이안된 단어일경우
          System.out.print("뜻을 입력하세요: ");
          kor = scanner.nextLine();
          try {
            dictionary.put(eng, kor);
          } catch (Exception e) {
            System.out.println("다시입력해주세요");
            e.printStackTrace();
          } finally {
            System.out.println("저장되었습니다.");
          }
        }
      }
    }
  }

  // 2.검색
  public void wordSearch() {
    while (true) {
      Scanner scr = new Scanner(System.in);
      System.out.println("검색할 단어를 입력하세요(Menu로가려면 menu입력):");
      String eng = scr.nextLine();
      if (eng.equals("menu") || eng.equals("Menu")) {
        break;
      } else {
        if (dictionary.containsKey(eng) == true) {// 검색한 영단어가 key값에 존재하면
          System.out.println(dictionary.get(eng)); // 입력한 key에 대응되는 value 출력
        } else {
          System.out.println("단어를 검색할 수 없습니다.");
        }
      }
    }
  }

  //3. 수정
  public void modification() {
    while (true) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("수정할 단어를 입력하세요(Menu로가려면 menu입력):");
      String key = scanner.nextLine();
      if (key.equals("menu") || key.equals("Menu")) {
        break;
      } else {
        if (dictionary.containsKey(key) == true) {
          System.out.println("수정할 뜻 입력 >> ");
          value = scanner.nextLine();
          dictionary.replace(key, value);
          System.out.println("단어의 뜻을 수정하였습니다.");
        } else {
          System.out.println("단어를 검색할 수 없습니다");
        }
      }
    }
  }

  //4.삭제
  public void wordDelete() {
    while (true) {
      Scanner scr = new Scanner(System.in);
      System.out.println("삭제하실 단어를 입력하세요(Menu로가면 menu입력:");
      String del = scr.nextLine();
      if (del.equals("menu") || del.equals("Menu")) {
        break;
      } else {
        if (dictionary.containsKey(del) == true) {
          System.out.println("(" + del + ":" + dictionary.remove(del) + ")단어를 삭제하였습니다.");
        } else {
          System.out.println("단어를 검색할 수 없습니다.");
        }
      }
    }
  }

  // 5. 목록
  public void wordlist() {
    Scanner scan = new Scanner(System.in);
    System.out.println("1.오름차순 2.내림차순 ");
    String select = scan.nextLine();
    while (true) {
      if (select.equals("1")) {
        Set<Map.Entry<String, String>> entries = dictionary.entrySet();


      } else if (select.equals("2")) {

      }
    }
  }

  //6. 색인
  public void lookup() {
  }

  //7.통계
  public void statistics() {
  }

  //8. 종료
  public void exit() {
    boolean stop = true;
  }


  public static int findNullIndex(Dictionary[] dictionaries) {
    for (int i = 0; i < dictionaries.length; i++) {
      if (dictionaries[i] == null) {
        return i;
      }
    }
    return -1;
  }
}