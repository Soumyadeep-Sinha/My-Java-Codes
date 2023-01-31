public class FindTownJudge {
    public static void main(String[] args) {
        int[][] trust = {{1,3},{2,3}};
        int n = 3;
        System.out.println(findJudge(n, trust));
    }

    public static int findJudge(int n, int[][] trust) {
        if(n == 1 && trust.length == 0){
            return 1;
        }
        int[] trustcount = new int[n+1];

        for (int i = 0; i < trust.length ; i++) {
            trustcount[trust[i][0]]--;
            trustcount[trust[i][1]]++;
        }

        for (int i = 1; i < trustcount.length; i++) {
            if(trustcount[i] == n-1){
                return i;
            }
        }

        return -1;
    }
}
