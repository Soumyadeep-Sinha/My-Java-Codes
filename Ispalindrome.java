package deep;

import java.util.*;

public class Ispalindrome {
    public static void main(String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s));
    }

     public static boolean isPalindrome(String s) {
         String low = s.toLowerCase();
         char[] arr;
         arr = low.toCharArray();
         ArrayList<Character> str = new ArrayList<>();
         System.out.println(arr);
         for (int i = 0; i < arr.length; i++) {
             if(arr[i] == 'a' || arr[i] == 'b' || arr[i] == 'c'
                     || arr[i] == 'd' || arr[i] == 'e' || arr[i] == 'f' || arr[i] == 'g'
                     || arr[i] == 'h' || arr[i] == 'j' || arr[i] == 'k' || arr[i] == 'l'
                     || arr[i] == 'm' || arr[i] == 'n' || arr[i] == 'o' || arr[i] == 'p'
                     || arr[i] == 'q' || arr[i] == 'r' || arr[i] == 's' || arr[i] == 't'
                     || arr[i] == 'u' || arr[i] == 'v' || arr[i] == 'w' || arr[i] == 'x'
                     || arr[i] == 'y' || arr[i] == 'z' || arr[i] == '0' || arr[i] == '1'
                     || arr[i] == '2' || arr[i] == '3' || arr[i] == '4' || arr[i] == '5'
                     || arr[i] == '6' || arr[i] == '7' || arr[i] == '8' || arr[i] == '9'){
                 str.add(arr[i]);
             }
         }
//         System.out.println(str);
         if(str.isEmpty()){
             return true;
         }
         char[] forward = new char[str.size()];
         char[] reversed = new char[str.size()];
         for (int j = 0; j < str.size(); j++){
             forward[j] = str.get(j);
             reversed[j] = str.get(str.size() - 1 - j);
         }
//         System.out.println(Arrays.toString(forward));
//         System.out.println(Arrays.toString(reversed));
         return Arrays.equals(forward, reversed);
//         for (int j = 0; j < str.size(); j++){
//             int start = j;
//             int end = str.size() - 1 - j;
//             if(str.get(start) != str.get(end)){
//                 return false;
//             }else if(str.get(start) == str.get(end) && start == end || str.get(start) == str.get(end) && end == start + 1){
//                 return true;
//             }
//         }
     }
}
