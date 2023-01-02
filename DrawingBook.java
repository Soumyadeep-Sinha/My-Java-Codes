public class DrawingBook {
    public static void main(String[] args) {
        int n = 7;
        int p = 1;
        System.out.println(pageCount(n,p));
    }

    public static int pageCount(int n, int p) {
        // Write your code here
        if(n == 0 || p == 0){
            return -1;
        }
        if(n <= 2){
            return 0;
        }
        int start = 1;
        int mid = n/2;
        if(p == n - 1 && n % 2 != 0){
            return 0;
        }
        if(p == n - 1 && n % 2 == 0|| p == start+1){
            return 1;
        }
        if(p == mid){
            return mid / 2;
        }
        if (p < mid){
            return countFromStart(p);
        }
        return countFromEnd(p, n);
    }

    public static int countFromStart(int p){
        return p / 2;
    }

    public static int countFromEnd(int p, int n){
        int mid = n / 2;
        int count = 0;
        for (int i = n; i > mid; i--) {
            if(p == i){
                return count/2;
            }
            count++;
        }
        return -1;
    }
}
