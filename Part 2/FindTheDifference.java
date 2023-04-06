public class FindTheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abced";
        System.out.println(findTheDifference(s,t));
    }

    public static char findTheDifference(String s, String t) {
        /*char[] str1 = new char[s.length()];
        char[] str2 = new char[t.length()];
        char ans = 0;

        for (int i = 0; i < s.length(); i++) {
            str1[i] = s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            str2[i] = t.charAt(i);
        }

        for(char cs : str1){
            ans ^= cs;
        }

        for(char ct : str2){
            ans ^= ct;
        }

        return ans;*/


        String main = s + t;
        char unique = 0;
        char[] str = new char[main.length()];
        for (int i = 0; i < main.length(); i++) {
            str[i] = main.charAt(i);
        }

        for(char ms : str){
            unique ^= ms;
        }
        return unique;
    }
}
