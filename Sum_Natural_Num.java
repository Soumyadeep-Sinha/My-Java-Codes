public class Sum_Natural_Num {
    public static void main(String[] args) {
        System.out.println(sum(6));
    }
    public static int sum(int n){
        if(n <= 1){
            return n;
        }
        return n + sum(n-1);
    }
}
