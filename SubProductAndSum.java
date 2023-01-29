public class SubProductAndSum {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int og = n;

        while(n != 0){
            int rem = n % 10;
            product *= rem;
            n = n / 10;
        }

        while(og != 0){
            int rem = og % 10;
            sum += rem;
            og = og / 10;
        }

        return product - sum;
    }
}
