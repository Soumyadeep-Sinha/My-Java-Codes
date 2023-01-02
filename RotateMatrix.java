import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] nums = {{0,0,0},{0,1,0},{1,1,1}};
        array(nums);
        System.out.println(Arrays.deepToString(nums));
    }

    public static void array(int[][] arr){
        //transpose
         int row = arr.length;
         int col = arr[0].length;
        for(int i = 0 ; i < row ; i++){
            for(int j = i ; j < col ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // swap columns
        for(int i=0;i < arr.length;i++)
        {
            int start = 0, end = row - 1;
            while(start < end)
            {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}
