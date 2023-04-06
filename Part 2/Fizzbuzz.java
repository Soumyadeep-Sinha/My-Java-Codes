package deep;

import java.util.*;

public class Fizzbuzz {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fizzBuzz(n));
    }
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1 ; i <= n ; i++){
            if(i%3 == 0){
                list.add("fizz");
            } else if (i % 5 == 0) {
                list.add("buzz");
            }else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
