import java.util.Arrays;

public class CountPoints {
    public static void main(String[] args) {
        int[][] points = {{1,3},{3,3},{5,3},{2,2}};
        int[][] queries = {{2,3,1},{4,3,1},{1,1,2}};

        System.out.println(Arrays.toString(countPoints(points, queries)));
    }

    public static int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            for (int j = 0; j < points.length; j++) {
                if(findDistance(points[j][0], queries[i][0], points[j][1], queries[i][1]) <= queries[i][2]){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    public static double findDistance(int x1, int x2, int y1, int y2){
        return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
    }
}
