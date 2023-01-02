public class Hiker {
    public static void main(String[] args) {
        int steps  = 8;
        String path = "UDDDUDUU";
        System.out.println(countingValleys(steps, path));
    }
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int level = 0;
        int valley = 0;
        int hill = 0;
        int count = 0;
        for (int i = 0; i < path.length(); i++) {
            if(path.charAt(i) == 'U'){
                hill++;
            }if(path.charAt(i) == 'D'){
                valley--;
            }if(hill + valley == 0 && path.charAt(i) != 'D'){
                count++;
                level++;
            }
        }
        return count;
    }
}
