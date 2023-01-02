import java.util.Arrays;
import java.util.Collections;

public class TESTER {
    public static void main(String[] args) {
        String[] unsorted = {"1", "200", "150", "3"};
        int[] num = new int[unsorted.length];
        for (int i = 0; i < unsorted.length; i++) {
            num[i] = Integer.parseInt(unsorted[i]);
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
}
