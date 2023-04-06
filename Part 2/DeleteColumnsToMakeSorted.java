public class DeleteColumnsToMakeSorted{
    public static void main(String[] args) {
        String[] strs = {"abc", "bce", "cae"};
        System.out.println(minDeletionSize(strs));
    }

    public static int minDeletionSize(String[] strs) {
        int count = 0;
        int length = strs[0].length();
        for (int i = 0; i < length; i++) {
            int j = 0;
            while(j < strs.length-1){
                if(strs[j].charAt(i)-'0' > strs[j+1].charAt(i)-'0'){
                    count++;
                    break;
                }
                j++;
            }
        }

        return count;
    }
}