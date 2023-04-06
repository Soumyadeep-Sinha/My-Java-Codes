import java.util.*;

public class BonAppetite {
    public static void main(String[] args) {
        List<Integer> price = new ArrayList<>();
        price.add(3);
        price.add(10);
        price.add(2);
        price.add(9);
        int k = 1;
        int b = 7;
        bonAppetit(price, k, b);
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < bill.size(); i++) {
            if(bill.get(i) != bill.get(k)){
                sum += bill.get(i);
            }
        }
        int billToBePaid = sum / 2;
        if(b == billToBePaid){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b - billToBePaid);
        }

    }
}
