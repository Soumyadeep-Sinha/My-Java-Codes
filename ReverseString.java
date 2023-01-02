import java.util.Arrays;
import java.util.Collections;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while(start <= end){
            swap(s, start, end);
            start++;
            end--;
        }
    }

    public static void swap(char[] arr, int first, int second){
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
