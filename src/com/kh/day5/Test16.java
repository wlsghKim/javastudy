package com.kh.day5;

public class Test16 {
    public static void main(String[] args) {
        int[] subject = new int[]{11,24,31, 42, 5};

        System.out.println(subject.length);

        for (int i = 0; i < subject.length; i++) {
            System.out.println(subject[i]);
        }
        method1();
    }

    public static void method1() {
        String[] names = new String[]{"함현식", "황성옥", "박제창", "김규서"};

        int index = (int)(Math.random()*4);
        System.out.println(names[index]);
    }
}