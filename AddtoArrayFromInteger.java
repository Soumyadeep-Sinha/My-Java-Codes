import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AddtoArrayFromInteger {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> res = new LinkedList<>();
        int len = num.length-1;
        while(len >= 0 || k > 0){
            if(len >= 0){
                k += num[len];
                len--;
            }
            res.addFirst(k % 10);
            k = k / 10;
        }
        return res;
    }
}
