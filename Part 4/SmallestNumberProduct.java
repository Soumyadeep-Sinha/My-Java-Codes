package deep;

import java.util.Scanner;

public class SmallestNumberProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int num = input.nextInt();
        System.out.println(product(num));
    }

    public static int product(int num){
        if(num < 10){
            return num+10;
        }
        int number = num;
        int pro = 1;
        int i = num;
        while(i < Integer.MAX_VALUE){
            while(i != 0 && pro != 0) {
                int remainder = i % 10;
                i = i / 10;
                pro = pro * remainder;
            }
            if(pro == num){
                return number;
            }
            number ++;
            i = number;
            pro = 1;
        }
        return -1;
    }
}
