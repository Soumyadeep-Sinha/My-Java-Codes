public class AddDigitstillSingle {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(addDigits(num));
    }

    public static int addDigits(int num) {
        while (num != 0){
            int original = num;
            int sum = original % 10;

            while(original != 0){
                original = original / 10;
                sum += original % 10;
            }
            num = sum;
            if(num / 10 == 0){
                return num;
            }
        }
        return -1;
    }
}
