public class BeautifulDays {
    public static void main(String[] args) {
        int i = 20;
        int j = 23;
        int k = 6;
        System.out.println(beautifulDays(i, j, k));
    }
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int beauty = 0;
        for (int l = i; l <= j ; l++) {
            if((l - reverse(l)) % k == 0){
                beauty++;
            }
        }
        return beauty;

    }
    public static int reverse(int n){
        int reverse = 0;
        while (n > 0){
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        return reverse;
    }
}
