public class EqualDigitCountAndVal {
    public static void main(String[] args) {
        String num = "030";
        System.out.println(digitCount(num));
    }

    public static boolean digitCount(String num) {
        for (int i = 0; i < num.length(); i++) {
            int count = 0;
            int val = num.charAt(i)-'0';
            for (int j = 0; j < num.length(); j++) {
                if(num.charAt(j)-'0' == i){
                    count++;
                }
            }
            if(count != val){
                return false;
            }
        }
        return true;
    }
}
