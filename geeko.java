import java.util.Scanner;

public class geeko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int times = input.nextInt();
        for(int i = 0 ; i < times ; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int n = input.nextInt();
            System.out.println(geekonacci(a,b,c,n));
        }
    }
    public static int geekonacci(int a, int b, int c, int n){
        if(n == 1){
            return a;
        }
        if(n == 2){
            return b;
        }
        if(n == 3){
            return c;
        }
        return geekonacci(a,b,c,n-1) + geekonacci(a,b,c,n-2) + geekonacci(a,b,c,n-3);
    }
}
