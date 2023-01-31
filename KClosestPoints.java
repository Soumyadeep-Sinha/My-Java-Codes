import java.util.*;

public class KClosestPoints {
    public static void main(String[] args) {
        int[][] points = {{3,3},{5,-1},{-2,4}};
        int k = 2;
        System.out.println(Arrays.toString(kClosest(points,k)));
    }

    public static int[][] kClosest(int[][] points, int k) {
        double[][] storage = new double[points.length][3];
        int[][] ans = new int[k][2];

        for (int i = 0; i < points.length; i++) {
            double distance = Math.sqrt(Math.pow(points[i][0],2) + Math.pow(points[i][1],2));
            System.out.println(distance);
            storage[i][0] = points[i][0];
            storage[i][1] = points[i][1];
            storage[i][2] = distance;
        }
        sort(storage);
        for (int i = 0; i < k; i++) {
            ans[i][0] = (int)storage[i][0];
            ans[i][1] = (int)storage[i][1];
        }

        return ans;
    }

    public static void sort(double[][] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if(array[j][2] < array[i][2]){
                    swap(array, i, j, 0);
                    swap(array, i, j, 1);
                    swap(array, i, j, 2);
                }
            }
        }
    }

    public static void swap(double[][] array,int num1, int num2, int index){
        double temp = array[num1][index];
        array[num1][index] = array[num2][index];
        array[num2][index] = temp;
    }
}
