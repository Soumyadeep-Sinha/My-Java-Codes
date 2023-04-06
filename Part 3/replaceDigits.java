public class replaceDigits {
    public static void main(String[] args) {
        String s = "a1b2c3d4e";
        System.out.println(replaceDigits(s));
    }

    public static String replaceDigits(String s) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        int j = 1;
        while(i < s.length() && j < s.length()){
            str.append(s.charAt(i));
            str.append(shift(s.charAt(i), (int)(s.charAt(j) - '0')));
            i+=2;
            j+=2;
        }
        if(s.length()%2 != 0){
            str.append(s.charAt(s.length()-1));
        }
        return str.toString();
    }

    public static char shift(char x, int i){
        return (char)(x + i);
    }
}
