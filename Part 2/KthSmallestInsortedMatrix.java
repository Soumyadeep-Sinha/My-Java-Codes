import java.util.ArrayList;
import java.util.Collections;

public class KthSmallestInsortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{-5}};
        int k = 1;
        System.out.println(kthSmallest(matrix, k));
    }

    public static int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(k-1);
    }
}
