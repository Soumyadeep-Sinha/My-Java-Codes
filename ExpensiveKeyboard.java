import java.util.*;
public class ExpensiveKeyboard {
    public static void main(String[] args) {
        int b = 5;
        int[] keyboard = {4};
        int[] drives = {5};
        System.out.println(getMoneySpent(keyboard, drives, b));
    }
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        List<Integer> ans = new ArrayList<>();
        ans.add(-1);
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if(keyboards[i] + drives[j] <= b){
                    ans.add(keyboards[i] + drives[j]);
                }
            }
        }
        Collections.sort(ans);
        return (ans.get(ans.size() - 1));
    }

}
