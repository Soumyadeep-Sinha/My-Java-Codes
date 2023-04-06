public class StringHalves{
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("UO"));
    }

    public static boolean halvesAreAlike(String s) {
        String str1 = s.substring(0, s.length()/2);
        String str2 = s.substring(s.length()/2, s.length());
        if(countVowels(str1) == countVowels(str2)){
            return true;
        }
        return false;
    }

    public static int countVowels(String s){
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count ++;
            }
        }

        return count;
    }
}