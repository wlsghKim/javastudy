package sec01_datatype.EX03_RangeOfVariableUse;

public class RangeOfvariableUse {
    public static void main(String[] args) {
        int value1 = 3;  // 지역변수의 생명주기 : 변수가 선언된 블럭내에서 유효하다.
        {
            // int value1; // 상위블럭에 선언된 변수는 하위 블럭에서 동일한이름으로 선언 불가
            int value2 = 5;
            System.out.println(value1);  // 상위블럭에 선언된 변수는 하위블럭에서 접근 가능
            System.out.println(value2);
        }

        System.out.println(value1);
        // System.out.println(value2); 하위블럭에 선언된 변수는 상위블럭에서 접근 불가.
        metod2( '*',  1);
        metod2( '*',  2);
        metod2( '*',  3);
        metod2( '*',  4);
        metod2( '*',  5);

    }
    public static void metod1(){
        int value1 = 10;
        System.out.println(value1);
    }

    public static void metod2(char c, int cnt){
    //    System.out.println(c);
    //    System.out.println(cnt);
         for(int i=1; i<=cnt; i++){
            System.out.print(c);
    }
        System.out.println();
    }
}
