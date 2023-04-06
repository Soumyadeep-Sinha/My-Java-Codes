public class SumVsXor {
    public static void main(String[] args) {
        System.out.println(sumXor(10));
    }
    public static long sumXor(long n) {
        // Write your code here
        long count = 0;
        long x = 0;
        while(x < n){
            long y = n ^ x;
            if(n + x == y){
                count ++;
            }
            x++;
        }
        return count;
    }
}
