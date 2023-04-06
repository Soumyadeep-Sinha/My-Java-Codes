import java.util.ArrayList;
import java.util.Arrays;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList(words));
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";



        String[] arr = new String[str.size()];
        for (int i = 0; i < str.size(); i++) {
            arr[i] = str.get(i);
        }

        return arr;
    }
}
