public class Robot {
    public static void main(String[] args) {
        String moves = "RLDU";
        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
        int distanceX = 0;
        int distanceY = 0;
        for(int i = 0 ; i < moves.length() ; i++){
            if(moves.charAt(i) == 'U'){
                distanceY++;
            }if(moves.charAt(i) == 'D'){
                distanceY--;
            }if(moves.charAt(i) == 'R'){
                distanceX++;
            }if(moves.charAt(i) == 'L'){
                distanceX--;
            }
        }
        if(distanceX == 0 && distanceY == 0){
            return true;
        }
        return false;
    }
}
