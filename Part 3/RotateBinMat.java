import java.util.Arrays;

public class RotateBinMat {
    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,1}};
        int[][] target = {{1,0},{0,1}};
        System.out.println(findRotation(mat,target));

    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        System.out.println(Arrays.deepToString(target));
        System.out.println();
        int[][] rotated = new int[mat.length][];
        for (int i = 0; i < mat.length; i++) {
            rotated[i] = mat[i];
        }
        for (int i = 0; i < mat.length*2; i++) {
            if(Arrays.deepEquals(target, rotated)){
                return true;
            }
            rotate(rotated);
        }
        return false;
    }

    public static void rotate(int[][] arr){
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
        System.out.println(Arrays.deepToString(arr));
    }
}
