package com.kh.day6;

public class Test5 {
    public static void main(String[] args) {
        String[][][] trainee = new String[][][] {
                {
                        {"윤태영","김민섭"},
                        {"박정효","유창혁","이종형","최민식"},
                        {"이관희","박청경","신세희","이수민"},
                        {"최민승","이준홍","황세호"},

                },
                {
                        {"오효정","최은아","윤난경"},
                        {"김진호","정훈","유원진","김영훈"},
                        {"이민기","박경진","박윤주"},
                        {"함현식","황성옥","박제창","김규서"},
                }
        };
        for (int i = 0; i < trainee.length; i++) {
            for (int j = 0; j < trainee[i].length; j++) {
                for (int k = 0; k < trainee[i][j].length; k++) {
                    if (k == trainee[i][j].length - 1) {
                    }else{
                        System.out.print(trainee[i][j][k]+"," );
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

        int i = (int) (Math.random() * trainee.length);
        int j = (int) (Math.random() * trainee[i].length);
        int k = (int) (Math.random() * trainee[i].length);

        System.out.println("반장님=" + trainee[i][j][k]);
    }
}