package deep;

import java.util.Scanner;

public class NoOfZeroesInFcatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        long num = input.nextInt();
        int count = 0;
        long i = num - 1;
        while(i >= 1) {
            num = num * i;
            i--;
        }
        System.out.println("THE FACTORIAL IS : " + num);
        while(num % 10 == 0){
            num = num / 10;
            count++;
        }
        System.out.println("NUMBER OF ZEROES IN THE END IS : " + count);
    }
}
