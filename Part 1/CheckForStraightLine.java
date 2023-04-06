public class CheckForStraightLine {
    public static void main(String[] args) {
        int[][] coordinates = {{0,0},{0,1},{0,-1}};
        System.out.println(checkStraightLine(coordinates));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        /*int l = coordinates.length;
        double disp = Math.sqrt(Math.pow((coordinates[l-1][0] - coordinates[0][0]),2) + Math.pow((coordinates[l-1][1] - coordinates[0][1]),2));
        double sum = 0;
        for (int i = 0; i < coordinates.length-1; i++) {
            sum += Math.sqrt(Math.pow((coordinates[i+1][0] - coordinates[i][0]),2) + Math.pow((coordinates[i+1][1] - coordinates[i][1]),2));
        }

        return sum == disp;*/

        /*if(coordinates.length == 2){
            return true;
        }
        float slope = (float)(coordinates[l-1][1] - coordinates[0][1]) / (coordinates[l-1][0] - coordinates[0][0]);
        for (int i = 0; i < coordinates.length-1; i++) {
            float slope2 = (float)(coordinates[i+1][1] - coordinates[i][1]) / (coordinates[i+1][0] - coordinates[i][0]);
            if(slope2 != slope){
                return false;
            }
        }
        return true;*/

        if(coordinates.length <= 2){
            return true;
        }
        // fonding slope using first two coordinates;
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        //equation of line y = m * x;
        //satisfying equation of line using other coordinates coordinates
        //if it fails to satisfy then it is not a straight line

        for(int i=2;i<coordinates.length;i++){
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if((y2 - y1) * (x1 - x) != (y1 - y) * (x2 - x1)){
                return false;
            }
        }
        return true;
    }
}
