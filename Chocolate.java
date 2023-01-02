import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chocolate {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>(Arrays.asList(2,2,1,3,2));
        int d = 4;
        int m = 2;
        System.out.println(birthday(s, d, m));

    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int n = s.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            if(i + m > n){
                return count;
            }
            for (int j = 0; j < m; j++) {
                sum = sum + s.get(j + i);
            }
            if(sum == d){
                count++;
            }
        }
        return count;
    }
}
