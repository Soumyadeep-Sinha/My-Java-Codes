public class IntegerToRoman {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(intToRoman(num));
    }

    public static String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] Characters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder str =  new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while(num >= values[i]){
                str.append(Characters[i]);
                num -= values[i];
            }
        }
        return str.toString();
    }
}
