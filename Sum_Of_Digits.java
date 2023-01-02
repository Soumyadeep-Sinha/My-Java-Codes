public class Sum_Of_Digits {
    public static void main(String[] args) {
        System.out.println(sumofdigits(10));
    }

    public static int sumofdigits(int n){
        if(n / 10 == 0){
            return n;
        }
        return (n % 10) + sumofdigits(n / 10);
    }
}
