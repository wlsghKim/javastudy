package com.kh.day6;

/*
* 학생별 총점 및 평균을 구하는 프로그램글 구현하시오
*/

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> 학생 성적 분석<<");
        System.out.println("학생수>");
        int numOfStudents = Integer.parseInt(scanner.nextLine());
        System.out.println("과목수>");
        int numOfSubjects = Integer.parseInt(scanner.nextLine());
        double[][] statics = new double[numOfStudents][numOfSubjects+3];

        for (int i = 0; i < statics.length; i++) {
            //번호
            statics[i][0] = i + 1;
            System.out.println("학생" + (i+1) + "의 점수입력");
            //점수
            for (int j = 1; j <= numOfStudents; j++) {
                System.out.println("과목" + j + " : ");
                statics[i][j] = Integer.parseInt(scanner.nextLine());
                //총점
                statics[i][statics[i].length - 2] += statics[i][j];
            }
            //평균
            statics[i][statics[i].length - 1] = statics[i][statics[i].length - 2] / numOfStudents;
        }

        //컬럼명
        System.out.printf("%5s", "번호");
        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.printf("%5s", "과목" + i);
        }
        System.out.printf("%5s","총계");
        System.out.printf("%5s\n","평균");

        //점수
        for (int i = 0; i < statics.length; i++) {
            for (int j = 0; j < statics[i].length; j++) {
                if (j == statics[i].length - 1) {
                    System.out.printf("%8.2f", statics[i][j]);
                } else {
                    System.out.printf("%6d", (int) statics[i][j]);
                }
            }
            System.out.println();
        }

        //최고득점자
        double max = statics[0][statics[0].length-2];
        double num = 1;
        for (int i = 0; i < statics.length; i++) {
            if(statics[i][statics[0].length-2]>max){
    max = statics[i][statics[0].length-2];
                num = i + 1;
            }
            }
        System.out.printf("총점이 가장 높은 학생번호와 점수는? %d번 %d점", (int)num,(int)max);
        }
    }
