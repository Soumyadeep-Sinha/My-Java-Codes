import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MaxWordsInStringArray {
    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < sentences.length ; i++){
            int count = 1;
            for(int j = 0 ; j < sentences[i].length() ; j++){
                if(sentences[i].charAt(j) == ' '){
                    count++;
                }
            }
            arr.add(count);
        }
        return Collections.max(arr);
    }
}
