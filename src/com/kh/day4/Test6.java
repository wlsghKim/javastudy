package com.kh.day4;
import  java.util.Scanner;
public class Test6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println(">> 사칙연산 프로그램 <<");
        boolean stop = false;
        outer :while (!stop) {
          System.out.print("메뉴 : 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.종료");
          System.out.println("선택 >");
            int menu = Integer.parseInt(scanner.nextLine());

            int flag =0;
            double result = 0.0;
            switch (menu) {
                case 1: //덧셈
                    result = calculate('+');
                    break;
                case 2: //뺄셈
                    result = calculate('-');
                    break;
                case 3: //곱셈
                    result = calculate('*');
                    break;
                case 4: //나눗셈
                    result = calculate('/');
                    break;
                case 5: //종료
                    while (true) {
                        System.out.println("종료 하시겠습니까?");
                        String answer = scanner.nextLine();
                        if (answer.equalsIgnoreCase("y")) {
                            break outer;
                        } else if (answer.equalsIgnoreCase("n")) {
                           flag = 1;
                            break;

                        } else {
                            continue;
                        }
                    }
                default:
            }
            if(flag == 1)
                continue;
                System.out.println("결과:" + result);
            }
            System.out.println("프로그램 종료!!");

        }


    public static double calculate(char operator){
        double result = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("피연산자 1");
        int op1 =Integer.parseInt(scanner.nextLine());
        System.out.println("피연산자 2");
        int op2 =Integer.parseInt(scanner.nextLine());

        switch ( operator) {
            case '+':
                result = op1 + op2;
                break;
            case '-':
                result = op1 - op2;
                break;
            case '*':
                result = op1 * op2;
                break;
            case '/':
                result = op1 / (double) op2;
                break;
        }
        return result;
                }
    }