public class SumDigitsWithBaseK {
    public static void main(String[] args) {
        System.out.println(sumBase(34,6));
    }

    public static int sumBase(int n, int k) {
        String str = Integer.toString(n,k);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int rem = str.charAt(i) - '0';
            sum += rem;
        }

        return sum;
    }
}
