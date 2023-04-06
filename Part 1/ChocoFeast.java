public class ChocoFeast {
    public static void main(String[] args) {
        int n = 12;
        int c = 4;
        int m = 4;
        System.out.println(chocolateFeast(n,c,m));
    }

    public static int chocolateFeast(int n, int c, int m) {
        // Write your code here
        int count = n / c;
        int wrapper = count;
        while(wrapper >= m){
            int extra = wrapper / m;
            count += extra;
            wrapper = extra + wrapper % m;
        }
        return count;
    }
}
