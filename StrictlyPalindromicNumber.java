public class StrictlyPalindromicNumber {
    public static void main(String[] args) {
//        System.out.println(Integer.toString(9, 2));
        System.out.println(isStrictlyPalindromic(4));
    }

    public static boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++) {
            if(!isPalindrome(Integer.toString(n, i), 0, Integer.toString(n,i).length() - 1)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
