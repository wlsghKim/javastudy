package com.kh.day17.c;

public class Message {
  private String msg;

  public Message(String msg) {
    this.msg = msg;
  }

  @Override
  public String toString() {
    return "Message{" +
        "msg='" + msg + '\'' +
        '}';
  }
}
