public class PowerOfThree {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(power(n));
    }

    public static boolean power(int n){
        if(n == 1){
            return true;
        }
        if(n%3 !=0){
            return false;
        }
        if(n == 3){
            return true;
        }
        n /= 3;
        if(n == 3){
            return true;
        }
        if(n > 3){
            return power(n);
        }
        return false;
    }
}
