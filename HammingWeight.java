import jdk.jfr.Unsigned;

public class HammingWeight {
    public static void main(String[] args) {
        int n = 521;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++){
            count += (n&1);
            n = n>>1;
        }
        return count;
    }
}
