public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(countEven(4));
    }

    public static int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if(sum(i) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int sum(int num){
        int sum = 0;
        while(num != 0){
            int rem = num % 2;
            sum += rem;
            num = num / 10;
        }
        return sum;
    }
}
