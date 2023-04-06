import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SherlockArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5));
        System.out.println(balancedSums(arr));
    }
    public static String balancedSums(List<Integer> arr) {
        // Write your code here
//        int start = 0;
//        int end = arr.size() - 1;
//        int mid = start;
//        for (int i = 0; i < arr.size(); i++) {
//            int sumL = 0;
//            int sumR = 0;
//            for (int j = 0; j < arr.size(); j++) {
//                if(j < mid){
//                    sumL += arr.get(j);
//                }
//                else if (j > mid){
//                    sumR += arr.get(j);
//                }
//            }
//            mid++;
//            if(sumL == sumR){
//                return "YES";
//            }
//        }
//
//        return "NO";

//        if(arr.size() == 0) return "NO";
//        if(arr.size() == 1) return "YES";
        int SumR = 0;
        for(int n : arr){
            SumR += n;
        }
        int SumL = 0;
        for(int n : arr)
        {
            if(SumL == SumR - n) {
                return "YES";
            }
            SumL += n;
            SumR -= n;
        }
        return "NO";
    }
}
