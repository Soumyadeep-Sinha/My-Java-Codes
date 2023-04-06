public class DiagSumAbs {
    public static void main(String[] args) {
        int[][] arr = {{-1}};
        System.out.println(sum(arr));
    }

    public static int sum(int[][] arr){
        int row = arr.length;
        int diag1 = 0;
        int diag2 = 0;
        if(arr.length == 1){
            if(arr[0][0] < 0){
                return arr[0][0] * (-1);
            }
            return arr[0][0];
        }
        for (int i = 0; i < row; i++) {
            diag1 += arr[i][i];
        }
        int i = 0;
        int j = row -1;
        while(i < row && j >= 0){
            diag2 += arr[i][j];
            i++;
            j--;
        }
        int ans = diag1 - diag2;
        if(ans < 0){
            return ans * (-1);
        }
        return ans;
    }
}
