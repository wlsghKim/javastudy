package com.kh.day17.c;

import java.util.LinkedList;
import java.util.Queue;

public class Main2 {
  public static void main(String[] args) {
    Message msg1 = new Message("문자1");
    Message msg2 = new Message("문자2");
    Message msg3 = new Message("문자3");

    Queue<Message> messages = new LinkedList<>();
    // 추가
    messages.offer(msg1);
    messages.offer(msg2);
    messages.offer(msg3);
    System.out.println(messages);

    // 탐색 without removing
    Message m1 = messages.peek();
    System.out.println(m1);
    Message m2 = messages.peek();
    System.out.println(m2);
    Message m3 = messages.peek();
    System.out.println(m3);
    System.out.println(messages);
    System.out.println(messages.size());

    // 추출 with removing
    Message mm1 = messages.poll();
    System.out.println(mm1);
    Message mm2 = messages.poll();
    System.out.println(mm2);
    Message mm3 = messages.poll();
    System.out.println(mm3);
    System.out.println(messages);
    System.out.println(messages.size());

    Message mm4 = messages.poll();

    // 전체 제거
    messages.clear();
    messages.peek();
    messages.element();
  }
}
