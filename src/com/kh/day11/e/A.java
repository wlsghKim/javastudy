package com.kh.day11.e;

public class A {
  void abc(int m) {
    m = 8;
  }
// 정적멤버, 필드 없음
//필드가 없어 힙메모리 비어있음
//abc가 정수m 입력받았고 m은 8을 대입함


  //배열 3개에 각각 4,5,6 대입
  // 둘다 값을 수정했음
  void bcd(int[] n) {
    n[0] = 4;
    n[1] = 5;
    n[2] = 6;

  }
}


