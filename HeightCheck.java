package deep;

public class HeightCheck {
    public static void main(String[] args) {
        int[] nums = {1,1,4,2,1,3};
        System.out.println(heightChecker(nums));
    }

    public static int heightChecker(int[] heights) {
        int count = 0;
        int [] expected = new int[heights.length];
        System.arraycopy(heights, 0, expected, 0, heights.length);
        sort(expected);
        for(int j = 0; j < heights.length ; j++){
            if (expected[j] != heights[j]){
                count++;
            }
        }
        return count;
    }

    public static void sort(int[] arr){
        int temp = 0;
        for(int i=0; i < arr.length; i++){
            for(int j=1; j < (arr.length-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
