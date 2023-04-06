public class AddStrings {
    public static void main(String[] args) {
        String num1 = "99999";
        String num2 = "77777777";
        System.out.println(addStrings(num1,num2));
    }

    public static String addStrings(String num1, String num2) {
        String rev = "";
        int l1 = num1.length()-1;
        int l2 = num2.length()-1;
        int carry = 0;

        while(l1 > -1 || l2 > -1 || carry != 0){
            int part1 = 0;
            int part2 = 0;
            if(l1 > -1){
                part1 = num1.charAt(l1)-'0';
                l1--;
            }
            if(l2 > -1){
                part2 = num2.charAt(l2)-'0';
                l2--;
            }
            int res = (part1 + part2 + carry) % 10;
            carry = (part1 + part2 + carry) / 10;
            rev += Integer.toString(res);
        }

        String ans = "";
        for (int i = rev.length()-1; i >= 0 ; i--) {
            ans += rev.charAt(i);
        }
        return ans;
    }
}
