import java.util.ArrayList;

public class SortSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        sort(arr);
        removeint(arr);
        String ans = "";
        for (int i = 0; i < arr.length-1; i++) {
            ans += arr[i] + " ";
        }
        ans += arr[arr.length-1];
        return ans;
    }

    public static void sort(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(Integer.parseInt(String.valueOf(arr[i].charAt(arr[i].length()-1))) >= Integer.parseInt(String.valueOf(arr[j].charAt(arr[j].length()-1)))){
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void swap(String[] arr, int first, int second){
        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void removeint(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replace(arr[i].substring(arr[i].length()-1), "");
        }
    }
}
