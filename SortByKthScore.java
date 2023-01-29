import java.util.Arrays;

public class SortByKthScore {
    public static void main(String[] args) {
        int[][] score = {{10,6,9,1},{7,5,11,2},{4,8,3,15}};
        int k = 2;
        System.out.println(Arrays.toString(sortTheStudents(score,k)));
    }

    public static int[][] sortTheStudents(int[][] score, int k) {
        for (int i = 0; i < score.length-1; i++) {
            for (int j = i+1; j < score.length; j++) {
                if(score[i][k] < score[j][k]){
                    swap(score, i, j);
                }
            }
        }
        return score;
    }

    public static void swap(int[][] arr, int index1, int index2){
        for (int i = 0; i < arr[0].length; i++) {
            int temp = arr[index1][i];
            arr[index1][i] = arr[index2][i];
            arr[index2][i] = temp;
        }
    }
}
