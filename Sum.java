package deep;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        for(int i = 0 ; i < s.length(); i++){
            if (s.charAt(i) == 'I') {
                sum += 1;
            }
            if (s.charAt(i) == 'I' ) {
                sum += 1;
            }
        }
        return sum;
    }
}
