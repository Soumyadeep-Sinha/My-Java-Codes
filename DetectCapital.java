import java.util.Locale;

public class DetectCapital {
    public static void main(String[] args) {

    }

    public static boolean detectCapitalUse(String word) {
        return (word.toLowerCase().equals(word) || word.substring(1, word.length()).toLowerCase().equals(word.substring(1, word.length())) || word.toUpperCase().equals(word));
    }
}
