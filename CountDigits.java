public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(7));
    }

    public static int countDigits(int num) {
        int count = 0;
        int original = num;
        while(num != 0){
            int rem = num % 10;
            if(original % rem == 0){
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}
