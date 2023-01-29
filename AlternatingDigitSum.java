import java.util.ArrayList;

public class AlternatingDigitSum {
    public static void main(String[] args) {
        System.out.println(alternateDigitSum(521));
    }

    public static int alternateDigitSum(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(n != 0){
            int rem = n % 10;
            arr.add(rem);
            n = n / 10;
        }
        int sumP = 0;
        int sumN = 0;
        for (int i = arr.size()-1; i >= 0 ; i--) {
            sumP += arr.get(i);
            i--;
        }
        for (int i = arr.size()-2; i >= 0 ; i--) {
            sumN += arr.get(i);
            i--;
        }
        return sumP - sumN;
    }
}
