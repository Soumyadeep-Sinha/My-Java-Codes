import java.util.Arrays;

public class DecodeXoredArray {
    public static void main(String[] args) {
        int[] encoded = {1,2,3};
        int first = 1;

        System.out.println(Arrays.toString(decode(encoded,first)));
    }

    public static int[] decode(int[] encoded, int first) {
        int[] ans = new int[encoded.length+1];
        ans[0] = first;
        //the equation x xor y=z
        // is equivalent to (x xor y) xor x=z xor x
        // which in turn (by the cancellation law), simplifies to y=z xor x
        for (int i = 1; i < ans.length; i++) {
            ans[i] = encoded[i-1] ^ ans[i-1];
        }
        return ans;
    }
}
