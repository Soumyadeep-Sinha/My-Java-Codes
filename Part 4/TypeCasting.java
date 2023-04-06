package deep;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //type casting
        int num = (int)(12.33);
        System.out.println(num);
        //automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = (a * b) / c;
        System.out.println(d);
    }
}
