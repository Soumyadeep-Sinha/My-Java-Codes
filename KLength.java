public class KLength {
    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
        System.out.println(minimumRecolors(blocks,k));
    }

    public static int minimumRecolors(String blocks, int k) {
        int count = Integer.MAX_VALUE;
        for (int i = 0; i < blocks.length(); i++) {
            for (int j = i; j < blocks.length(); j++) {
                if(j-i+1 == k){
                    int num = 0;
                    for (int l = i; l <= j; l++) {
                        if(blocks.charAt(l) == 'W'){
                            num++;
                        }
                    }
                    count = Math.min(count, num);
                }
            }
        }
        return count;
    }
}
