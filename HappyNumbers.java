package deep;

import java.util.ArrayList;

public class HappyNumbers {
    public static void main(String[] args) {
        int num = 2147483647;
        System.out.println(isHappy(num));
    }
    public static boolean isHappy(int n){
        int original = n;
        int sum = 0;
        ArrayList<Integer> oldsum = new ArrayList<>();
        while(n > 0){
            while(n != 0) {
                int remainder = n % 10;
                n = n / 10;
                sum = sum + remainder * remainder;
            }
            if(sum == 1){
                return true;
            }if(sum == original){
                return false;
            }if(oldsum.contains(sum)){
                return false;
            }
            else{
                oldsum.add(sum);
                n = sum;
                sum = 0;
            }
        }
        return false;
    }

 // SOL 2

//    public static boolean isHappy(int n) {
//        int fast = n;
//        int slow = n;
//        slow = findSquare(slow);
//        fast = findSquare(findSquare(fast));
//        while(slow!=fast){
//            slow = findSquare(slow);
//            fast = findSquare(findSquare(fast));
//        }
//        if(slow==1){
//            return true;
//        }
//        return false;
//    }
//
//    public static int findSquare(int number){
//        int ans=0;
//        while(number>0){
//            int rem=number%10;
//            ans+=rem*rem;
//            number/=10;
//        }
//        return ans;
//    }
}
