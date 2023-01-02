import java.util.ArrayList;
import java.util.Collections;

public class Compliment {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findComplement(n));
    }
    public static int findComplement(int num) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(num != 0){
            arr.add(num%2);
            num = num / 2;
        }

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 0){
                arr.set(i, 1);
            }
            else if(arr.get(i) == 1){
                arr.set(i, 0);
            }
        }
        int power = 1;
        for (int i = 0; i < arr.size() ; i++) {
            num = num + arr.get(i) * power;
            power *= 2;
        }

        return num;
    }
}
