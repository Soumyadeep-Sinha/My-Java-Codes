public class EqualArraysII {
    public static void main(String[] args) {
        System.out.println(minOperations(4));
    }

    public static int minOperations(int n) {
        int minsteps = 0;
        if(n == 2){
            return 0;
        }
        // if n is even
        if(n%2 == 0){
            for (int i = 0; i < n/2; i++) {
                minsteps += (2*i) + 1;
            }
        }

        //if n is odd
        if(n%2 != 0){
            for (int i = 0; i < n/2; i++) {
                minsteps += n - ((2*i) + 1);
            }
        }
        return minsteps;
    }
}
