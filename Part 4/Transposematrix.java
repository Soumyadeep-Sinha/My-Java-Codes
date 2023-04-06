package deep;

public class Transposematrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(transpose(mat));
    }
    public static int[][] transpose(int[][] nums){
        int row = nums.length;
        int col = nums[0].length;
        int[][] arr = new int[col][row];
        for(int i = 0 ; i < row ; i ++){
            for(int j = 0 ; j < col ; j++){
                arr[j][i] = nums[i][j];
            }
        }
        return arr;
    }
}
