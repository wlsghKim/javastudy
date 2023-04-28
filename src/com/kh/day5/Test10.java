package com.kh.day5;

public class Test10 {
    public static void main(String[] args) {
        int x = 10;
        double y = 3.14;

        long a =10L;
        float b = 3.14f;

        long c = 2_148_000_000L;

        char d = 'A';
        System.out.println("d = " + d  );
        System.out.println("d=" + (short)d);

        char e = 65;
        System.out.println("e="+e);
        System.out.println("e="+(char)e);

        char f = 0b01000001; //2진수 0b+2 진수
        System.out.println("f=" + f);
        System.out.println("f=" + (int)f);

        char g =0101; // 8진수 0+8진수
        System.out.println("g="+g);
        System.out.println("g="+(int)g);

        char h =0x41; // 16진수 0x+16진수
        System.out.println("h="+h);
        System.out.println("h="+(int)h);

        char i ='\u0041'; // 유니코드 'u' + 16진수
        System.out.println("i="+i);
        System.out.println("i="+(int)i);

        char j = 'A';
        int k = 2;

        int l = j + k;
        System.out.println("l=+" + l);

    }
}
