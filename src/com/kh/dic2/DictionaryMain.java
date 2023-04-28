package com.kh.dic2;


import java.util.*;

public class DictionaryMain {
  public static void main(String[] args) {
    Dictionary dic = new Dictionary();
    Scanner scanner = new Scanner(System.in);
    boolean stop = false;
    while (!stop) {
      try {
        System.out.println("1.저장 2.검색 3.수정 4.삭제 5.목록 6.색인 7.통계 8.종료");
        System.out.print("선택 >> ");
        String menu = scanner.nextLine();

        String word = null;     //단어
        String meaning = null;  //의미
        switch (menu) {
          case "1": //저장
            System.out.print("단어입력 : ");
            word = scanner.nextLine();
            System.out.print("의미입력 : ");
            meaning = scanner.nextLine();
            dic.put(word,meaning);
            break;
          case "2": //검색
            System.out.print("단어입력 : ");
            word = scanner.nextLine();
            Map<String, String> result = dic.findByWord(word);
            printList(result);
            break;
          case "3": //수정
            System.out.print("단어입력 : ");
            word = scanner.nextLine();
            System.out.print("의미입력 : ");
            meaning = scanner.nextLine();
            dic.update(word,meaning);
            break;
          case "4": //삭제
            System.out.print("단어입력 : ");
            word = scanner.nextLine();
            dic.delete(word);
            break;
          case "5": //목록
            System.out.println("1.오름차순 2.내림차순");
            System.out.print("선택 >> ");
            String subMenu = scanner.nextLine();
            switch (subMenu) {
              case "1":  //오름차순
                Map<String, String> ascending = dic.list(1);
                printList(ascending);
                break;
              case "2":  //내림차순
                Map<String, String> descending = dic.list(2);
                printList(descending);
                break;
              default :
                break;
            }
            break;
          case "6": //색인
            System.out.print("색인 입력 : ");
            char ch = scanner.nextLine().charAt(0);
            List<String> list = dic.index(ch);
            System.out.println(list);
            break;
          case "7": //통계
            List<Object> statistics = dic.statistics();
            //1.단어 갯수
            int cnt = (Integer)statistics.get(0);
            System.out.println("1.단어갯수 : " + cnt);

            //2.문자열길이가 가장긴 단어
            List wordsOfMaxLength = (List) statistics.get(1);
            System.out.println("2.문자열길이가 가장긴 단어");
            for (Object ele : wordsOfMaxLength) {
              String maxWord = (String)ele;
              System.out.printf("%s\n", maxWord);
            }

            //3.문자열길이 내림차순
            List wordsByDescending = (List) statistics.get(2);
            System.out.println("3.문자열길이 내림차순");
            for (Object ele : wordsByDescending) {
              String wordByDescending = (String)ele;
              System.out.printf("%s\n", wordByDescending);
            }

            break;
          case "8": // 종료
            stop = true;
            continue;
          default:
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    System.out.println("프로그램 종료!");
  }

  private static void printList(Map<String, String> result) {
    for( Map.Entry<String,String> entry : result.entrySet()){
      System.out.printf("%s : %s\n", entry.getKey(), entry.getValue());
    }
  }
}