package com.kh.day5;

public class Test1 {
    public static void main(String[] args) {

        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
              flag =true;

            if(flag) {
            continue;
            }else {
                break;
            }
            }
            System.out.println("i=" + i);
        }
    }
}