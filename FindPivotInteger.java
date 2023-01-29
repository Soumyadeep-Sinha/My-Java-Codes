public class FindPivotInteger {
    public static void main(String[] args) {
        System.out.println(pivotInteger(4));
    }

    public static int pivotInteger(int n) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= n ; i++) {
            sum2 += i;
        }
        int ptr = 1;
        while(sum1 <= sum2){
            sum1 += ptr;
            if(sum1 == sum2){
                return ptr;
            }
            sum2 -= ptr;
            ptr++;
        }

        return -1;
    }
}
