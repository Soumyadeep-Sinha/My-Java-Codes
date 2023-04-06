public class One_to_N {
    public static void main(String[] args) {
//        fun(1,7);
        fun(7);
    }
    public static void fun(int n, int m){
        if(n == m){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        fun(n+1, m);
    }

    public static void fun(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
}
