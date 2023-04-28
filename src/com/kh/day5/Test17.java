package com.kh.day5;

public class Test17 {
    public static void main(String[] args) {
        int[] subject = new int[3];

        System.out.println("subject=" + subject);

        for (int i = 0; i < subject.length; i++) {
            System.out.println("subject[" + i + "]=" + subject[i]);
        }
        System.out.println("---------------------");
        method(subject);
        System.out.println("----------------------");
        for (int i = 0; i < subject.length; i++) {
            System.out.println("subject[" + i + "] = " + subject[i]);
        }
    }
    public static void method(int[] subject) {
        for (int i = 0; i < subject.length; i++) {
            System.out.println("subject["+i+"] = " + subject[i]);
        }
        subject[0] =10;
        subject[1] =20;
        subject[2] =30;
    }
}
