package com.kh.day15.g;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
  }
    static void method1 () {
      FileWriter fw = null;
      //try~catch~finally
      try {
        //파일객체 생성
        File f = new File("d:\\javaedu10\\test.txt");
        //파일 존재여부 체크
        if (!f.exists()) {
          f.createNewFile();
        }
        //파일 쓰기
        fw = new FileWriter(f);
        fw.write("반갑습니다");
        //버퍼내용을 파일에 쓰기
        fw.flush();
        // io채널 반납
        fw.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    //try~with-resources : 자동 지원 반납
    // 전제조건 : java.lang.autocloseable 인터페이스를 구현하고 있어야함.

    static void method2 () {
      //파일객체 생성
      File f = new File("d:\\javaedu10\\test.txt");

      try(FileWriter fw = new FileWriter(f)) {

        //파일 존재여부 체크
        if (!f.exists()) {
          f.createNewFile();
        }

        //파일 쓰기
         fw.write("반갑습니다");
        //버퍼내용을 파일에 쓰기
        fw.flush();

      } catch (IOException e) {
        e.printStackTrace();
        }
     }
  }

