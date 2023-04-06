public class CountAsterisks2 {
    public static void main(String[] args) {
        String s = "yo|uar|e**|b|e***au|tifu|l";
        System.out.println(countAsterisks(s));
    }

    public static int countAsterisks(String s){
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '|'){
                count2++;
            }
            if(count2 % 2 == 0 && s.charAt(i) == '*'){
                count1++;
            }
        }
        return count1;
    }
}
