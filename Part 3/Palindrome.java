public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palin(123454321));
    }
    public static int reverse2(int n){
        int digits = (int)(Math.log10(n) + 1);
        return helper(n, digits);
    }

    private static int helper(int n, int digits){
        if(n % 10 == 0){
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10, digits-1) + helper(n /10, digits -1);
    }
     public static boolean palin(int n){
        if(n == reverse2(n)){
            return true;
        }
        return false;
     }

}
