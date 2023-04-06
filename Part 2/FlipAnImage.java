import java.util.Arrays;

public class FlipAnImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        flip(image);
        invert(image);
        return image;
    }

    public static void flip(int[][] arr){
        int start = 0;
        int end = arr[0].length-1;
        while(start < end){
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
            }
            start++;
            end--;
        }
    }

    public static void invert(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0){
                    arr[i][j] = 1;
                }
                else if(arr[i][j] == 1){
                    arr[i][j] = 0;
                }
            }
        }
    }
}
