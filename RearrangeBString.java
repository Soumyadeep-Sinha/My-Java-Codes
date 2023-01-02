import java.util.Arrays;

public class RearrangeBString {
    public static void main(String[] args) {
        String s = "001011";
        System.out.println(secondsToRemoveOccurrences(s));

    }
    public static int secondsToRemoveOccurrences(String s) {
        if(s.length() == 1){
            return 0;
        }
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        int count = 0;

        while (true){
            boolean flag = false;
            int i = 1;
            while (i < arr.length){
                if(arr[i-1] == '0' && arr[i] == '1'){
                    swap(arr, i-1, i);
                    i = i+2;
                    flag = true;
                }
                else {
                    i++;
                }
            }
            if (!flag){
                break;
            }
            count++;
        }
        return count;
    }

    public static void swap(char[] arr, int first, int second){
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
