package com.kh.day5;

public class Test15 {

    public static void main(String[] args) {
        String[] subject; //권장
        int subject2[];

        //배열의 생성
        subject = new String[3];  // 각요소의 초기값은 타입의 기본값이다.

        //배열 요소의 접근
        for (int i = 0; i < subject.length; i++) {
            if (i == 2) {
                subject[i] = String.valueOf(100);
            } else {
                subject[i] = String.valueOf(-100);
            }
            System.out.println("subject[" + i + "] = " + subject[i]);
        }

        System.out.println("subject=" + subject);
    }
}