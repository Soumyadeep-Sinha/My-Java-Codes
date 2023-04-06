package deep;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome2 {
    public static void main(String[] args) {
        String s = "abca";

        System.out.println(validPalindrome(s));
    }
     public static boolean validPalindrome(String s) {
         char[] arr;
         ArrayList<Character> list = new ArrayList<>();
         arr = s.toCharArray();
         System.out.println(arr);
         for (char c : arr) {
             list.add(c);
         }
         for(int j = 0 ; j < arr.length ; j++){
             list.remove(j);
             if(isPalindrome(list)){
                 return true;
             }else{
                 list.add(j, arr[j]);
             }
         }
         return false;
     }

    public static boolean isPalindrome(ArrayList<Character> list){
        if(list.isEmpty()){
            return true;
        }
        char[] forward = new char[list.size()];
        char[] reversed = new char[list.size()];
        for (int j = 0; j < list.size(); j++){
            forward[j] = list.get(j);
            reversed[j] = list.get(list.size() - 1 - j);
        }
//         System.out.println(Arrays.toString(forward));
//         System.out.println(Arrays.toString(reversed));
        return Arrays.equals(forward, reversed);
    }
}
