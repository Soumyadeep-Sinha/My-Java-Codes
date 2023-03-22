public class ConsistentString{
    public static void main(String[] args) {
        String allowed = "cad";
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if(checkAllowed(allowed, words[i])){
                count++;
            }
        }
        return count;
    }

    public static boolean checkAllowed(String s, String x){
        for (int i = 0; i < x.length(); i++) {
            if(!s.contains(x.substring(i,i+1))){
                return false;
            }
        }
        return true;
    }
}