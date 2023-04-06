import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumber {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> lucky = new ArrayList<>();
        int max = matrix[0][0];
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 1 ; i < row ; i++) {
            for (int j = i; j < col; j++) {
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        lucky.add(max);
        return lucky;
    }

}
