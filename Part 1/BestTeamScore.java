public class BestTeamScore {
    public static void main(String[] args) {

    }

    public static int bestTeamScore(int[] scores, int[] ages) {
        for (int i = 0; i < scores.length; i++) {
            if(!checkconflict(scores,ages,i, scores.length)){
                return getsum(scores, i, scores.length);
            }
        }
        return 0;
    }

    public static boolean checkconflict(int[] scores, int[] ages, int start, int end){
        for (int i = start; i < end; i++) {
            if(ages[i] > ages[i+1] && scores[i] < scores[i+1]){
                return true;
            }
        }
        return false;
    }
    
    public static int getsum(int[] scores, int start, int end){
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum;
    }
}
