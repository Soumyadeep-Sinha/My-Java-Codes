public class FindDigitsDivisors {
    public static void main(String[] args) {
        int n = 1012;
        System.out.println(findDigits(n));
    }
    public static int findDigits(int n) {
        // Write your code here
        int original = n;
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            if(rem != 0 && original % rem == 0){
                count++;
            }
        }
        return count;
    }
}
