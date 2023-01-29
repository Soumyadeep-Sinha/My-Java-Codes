public class KBeautyOfArray {
    public static void main(String[] args) {
        System.out.println(divisorSubstrings(9090,3));
    }

    public static int divisorSubstrings(int num, int k) {
        String str = Integer.toString(num);
        int i = 0;
        int count = 0;
        while(i <= str.length()-k){
            String sub = str.substring(i, i+k);
            if(Integer.parseInt(sub) != 0 && num % Integer.parseInt(sub) == 0){
                count++;
            }
            i++;
        }
        return count;
    }
}
