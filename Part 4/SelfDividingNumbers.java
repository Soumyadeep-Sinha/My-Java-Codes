import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right ; i++) {
            if(check(i)){
                ans.add(i);
            }
        }
        return ans;
    }
    public static boolean check(int num){
        int original = num;

        while(num != 0){
            int rem = num % 10;
            if(rem != 0 && original % rem == 0){
                num = num / 10;
            }
            if(rem == 0 || original % rem != 0){
                return false;
            }
        }
        return true;
    }
}
