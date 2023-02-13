public class RemoveAllOccurances {
    public static void main(String[] args) {
        String s = "aabababa";
        String part = "aba";
        System.out.println(removeOccurrences(s,part));
    }

    public static String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            s = s.replaceFirst(part, "");
        }
        return s;
    }
}
