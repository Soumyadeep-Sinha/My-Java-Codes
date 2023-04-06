import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> brr = new ArrayList<>();
        //arr
        arr.add(203);
        arr.add(204);
        arr.add(205);
        arr.add(206);
        arr.add(207);
        arr.add(208);
        arr.add(203);
        arr.add(204);
        arr.add(205);
        arr.add(206);
        //brr
        brr.add(203);
        brr.add(204);
        brr.add(204);
        brr.add(205);
        brr.add(206);
        brr.add(207);
        brr.add(205);
        brr.add(208);
        brr.add(203);
        brr.add(206);
        brr.add(205);
        brr.add(206);
        brr.add(204);
        System.out.println(missingNumbers(arr,brr));
    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        System.out.println(arr);
        System.out.println(brr);
//        if(brr.size() > arr.size()){
//            brr.removeAll(arr);
//            System.out.println(brr);
//            return brr;
//        }
//        arr.removeAll(brr);
//        System.out.println(arr);
//        return arr;
        List<Integer> ans = new ArrayList<>();
        if(brr.size() > arr.size()){
            for (int i = 0; i < arr.size(); i++) {
                brr.remove(arr.get(i));
            }
            System.out.println(brr);
            for (int n : brr){
                if(!ans.contains(n)){
                    ans.add(n);
                }
            }
            Collections.sort(ans);
            return ans;
        }
        for (int i = 0; i < brr.size(); i++) {
            arr.remove(brr.get(i));
        }
        System.out.println(arr);
        for (int n : arr){
            if(!ans.contains(n)){
                ans.add(n);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
