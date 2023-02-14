public class CountPrefixes {
    public static void main(String[] args) {
        String[] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        System.out.println(countPrefixes(words,s));
    }

    public static int countPrefixes(String[] words, String s) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if(s.indexOf(words[i]) == 0){
                count++;
            }
        }
        return count;
    }
}
