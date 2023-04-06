public class N_to_One {
    public static void main(String[] args) {
        fun(7);
    }
    public static void fun(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
}
