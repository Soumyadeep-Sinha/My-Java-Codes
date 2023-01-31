import java.util.Arrays;

public class DeleteGreatestValueInRow {
    public static void main(String[] args) {
        int[][] grid = {{10,20,30}};
        System.out.println(deleteGreatestValue(grid));
    }

    public static int deleteGreatestValue(int[][] grid) {
        if(grid.length == 1){
            int max = 0;
            for (int i = 0; i < grid[0].length; i++) {
                max += grid[0][i];
            }
            return max;
        }
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }

        int j = grid[0].length-1;
        while(j >= 0){
            ans += getmax(grid, j);
            j--;
        }

        return ans;
    }

    public static int getmax(int[][] array, int col){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(array[i][col], max);
        }
        return max;
    }

}
