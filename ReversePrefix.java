public class ReversePrefix {
    public static void main(String[] args) {
        String str = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(str, ch));
    }

    public static String reversePrefix(String word, char ch) {
        StringBuilder str = new StringBuilder();
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch){
                index = i;
                break;
            }
        }

        for (int i = index; i >= 0 ; i--) {
            str.append(word.charAt(i));
        }

        for (int i = index+1; i < word.length(); i++) {
            str.append(word.charAt(i));
        }

        return str.toString();
    }
}
