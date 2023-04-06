public class TriFibonacci {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }

    public static int tribonacci(int n) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 1;
        if(n == 0){
            return num1;
        }
        if(n == 1){
            return num2;
        }
        if(n == 2){
            return num3;
        }
        for(int i = 2 ; i < n ; i++){
            int temp1 = num3;
            int temp2 = num2;
            num3 = num3 + num2 + num1;
            num2 = num2 + num1;
            num2 = temp1;
            num1 = temp2;
        }
        return num3;
    }
}
