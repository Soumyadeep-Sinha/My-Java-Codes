import java.util.ArrayList;

public class LarOddInString {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("239537672423884969653287101"));
    }

    public static String largestOddNumber(String num) {
        int n  = num.length();
        for(int i= n-1; i>=0; i--){
            if(num.charAt(i)%2!=0) return num.substring(0, i+1);
        }
        return "";
    }
}
