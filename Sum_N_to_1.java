public class Sum_N_to_1 {
    public static void main(String[] args) {
        System.out.println(sum(1));
    }

    public static int sum(int n){
        if(n <= 1){
            return n;
        }
        return n + sum(n-1);
    }
}
