public class LargestOddNumberInString {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));
    }

    public static String largestOddNumber(String num) {
        int max = 0;
        for (int i = 0; i < num.length(); i++) {
            if((num.charAt(i) - '0') % 2 != 0){
                max = Math.max(max, (num.charAt(i) - '0'));
            }
        }
        return Integer.toString(max);
    }
}
